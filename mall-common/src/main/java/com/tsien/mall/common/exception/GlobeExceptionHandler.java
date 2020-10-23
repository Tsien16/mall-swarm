package com.tsien.mall.common.exception;

import com.tsien.mall.common.domain.enums.ResponseCodeEnum;
import com.tsien.mall.common.util.ServerResponse;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.naming.InsufficientResourcesException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * 全局异常处理
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/12 0012 2:01
 */

@RestControllerAdvice
public class GlobeExceptionHandler {

    /**
     * 处理抛出的ApiException
     *
     * @param e ApiException
     * @return ServerResponse
     */
    @ExceptionHandler(value = ApiException.class)
    @SuppressWarnings("rawtypes")
    public ServerResponse apiExceptionHandle(ApiException e) {
        if (e.getResponseCodeEnum() != null) {
            return ServerResponse.failed(e.getResponseCodeEnum().getCode(), e.getResponseCodeEnum().getMessage());
        }
        return ServerResponse.failed(e.getMessage());
    }

    /**
     * 处理数据库SQL异常处理
     *
     * @param e SQLException
     * @return ServerResponse
     */
    @ExceptionHandler(SQLException.class)
    @SuppressWarnings("rawtypes")
    public ServerResponse sqlExceptionHandler(SQLException e) {
        if (e instanceof SQLIntegrityConstraintViolationException) {
            return ServerResponse.failed(ResponseCodeEnum.FAILED.getCode(), "该数据有关联数据，操作失败");
        }
        return ServerResponse.failed(ResponseCodeEnum.FAILED.getCode(), "数据库异常，操作失败");
    }

    /**
     * 404 异常处理
     *
     * @param request request
     * @param e       NoHandlerFoundException
     * @return ServerResponse
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    public ServerResponse<Map<Object, Object>> noHandlerFoundExceptionHandler(HttpServletRequest request,
                                                                              HttpServletResponse response,
                                                                              NoHandlerFoundException e) {

        response.setStatus(HttpStatus.NOT_FOUND.value());
        String requestMethod = request.getMethod();
        String requestUri = request.getRequestURI();
        Map<Object, Object> requestInfoMap = new HashMap<>(2);
        requestInfoMap.put("requestMethod", requestMethod);
        requestInfoMap.put("requestUri", requestUri);

        return ServerResponse.failed(ResponseCodeEnum.NOT_FOUND.getCode(), ResponseCodeEnum.NOT_FOUND.getMessage(),
                requestInfoMap);
    }

    /**
     * 处理Get请求中 使用@Valid 验证路径中请求实体校验失败后抛出的异常
     *
     * @param e BindException
     * @return ServerResponse
     */
    @ExceptionHandler(value = BindException.class)
    @SuppressWarnings("rawtypes")
    public ServerResponse bindExceptionHandler(BindException e) {
        String message =
                e.getBindingResult().getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining());
        return ServerResponse.failed(ResponseCodeEnum.VALIDATE_FAILED.getCode(), message);
    }

    /**
     * 处理请求参数格式错误 @RequestParam上validate失败后抛出的异常是javax.validation.ConstraintViolationException
     *
     * @param e ConstraintViolationException
     * @return ServerResponse
     */
    @ExceptionHandler(value = ConstraintViolationException.class)
    @SuppressWarnings("rawtypes")
    public ServerResponse constraintViolationExceptionHandler(ConstraintViolationException e) {
        String message =
                e.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.joining());
        return ServerResponse.failed(ResponseCodeEnum.VALIDATE_FAILED.getCode(), message);
    }

    /**
     * 处理请求参数格式错误 @RequestBody上validate失败后抛出的异常是MethodArgumentNotValidException异常
     *
     * @param e MethodArgumentNotValidException
     * @return ServerResponse
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @SuppressWarnings("rawtypes")
    public ServerResponse methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        String message =
                e.getBindingResult().getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining());
        return ServerResponse.failed(ResponseCodeEnum.VALIDATE_FAILED.getCode(), message);
    }


    /**
     * 通用异常处理
     *
     * @param e Exception
     * @return ServerResponse
     */
    @ExceptionHandler(value = Exception.class)
    @SuppressWarnings("rawtypes")
    public ServerResponse exceptionHandler(Exception e) {
        e.printStackTrace();
        return ServerResponse.failed(ResponseCodeEnum.FAILED.getCode(), e.getMessage());
    }

}
