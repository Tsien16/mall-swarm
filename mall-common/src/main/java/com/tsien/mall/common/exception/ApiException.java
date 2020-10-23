package com.tsien.mall.common.exception;

import com.tsien.mall.common.domain.enums.ResponseCodeEnum;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/12 0012 2:03
 */

public class ApiException extends RuntimeException {

    private ResponseCodeEnum responseCodeEnum;

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(ResponseCodeEnum responseCodeEnum) {
        super(responseCodeEnum.getMessage());
        this.responseCodeEnum = responseCodeEnum;
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResponseCodeEnum getResponseCodeEnum() {
        return responseCodeEnum;
    }

}
