package com.tsien.mall.auth.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsien.mall.common.domain.enums.ResponseCodeEnum;
import com.tsien.mall.common.util.ServerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * AuthenticationEntryPoint 认证入口点及其实现类
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/14 0014 14:46
 */

@Slf4j
@Configuration
public class MyAuthenticationEntryPoint implements AuthenticationEntryPoint {

    /**
     * Commences an authentication scheme.
     * <p>
     * <code>ExceptionTranslationFilter</code> will populate the <code>HttpSession</code>
     * attribute named
     * <code>AbstractAuthenticationProcessingFilter.SPRING_SECURITY_SAVED_REQUEST_KEY</code>
     * with the requested target URL before calling this method.
     * <p>
     * Implementations should modify the headers on the <code>ServletResponse</code> as
     * necessary to commence the authentication process.
     *
     * @param request       that resulted in an <code>AuthenticationException</code>
     * @param response      so that the user agent can begin authentication
     * @param authException that caused the invocation
     */
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();
        String errorMsg;

        // 用户未登录异常
        if (authException instanceof BadCredentialsException) {
            errorMsg = ResponseCodeEnum.UNAUTHORIZED.getMessage();
        } else if (authException instanceof InsufficientAuthenticationException) {
            errorMsg = "客户端身份认证信息异常，请携带正确的Authorization信息";
        } else {
            errorMsg = "请求异常：" + authException.toString();
        }
        response.setStatus(HttpStatus.UNAUTHORIZED.value());

        printWriter.write(new ObjectMapper().writeValueAsString(ServerResponse.failed(ResponseCodeEnum.UNAUTHORIZED.getCode(), errorMsg)));
        printWriter.flush();
        printWriter.close();

    }
}
