package com.tsien.mall.common.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.tsien.mall.common.domain.enums.ResponseCodeEnum;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/12 0012 11:12
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServerResponse<T> implements Serializable {

    private final int code;
    private String message;
    private T data;

    private ServerResponse(int code) {
        this.code = code;
    }

    private ServerResponse(int code, T data) {
        this.code = code;
        this.data = data;
    }

    private ServerResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private ServerResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return this.code == ResponseCodeEnum.SUCCESS.getCode();
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public static <T> ServerResponse<T> success() {
        return new ServerResponse<>(ResponseCodeEnum.SUCCESS.getCode());
    }

    public static <T> ServerResponse<T> success(String message) {
        return new ServerResponse<>(ResponseCodeEnum.SUCCESS.getCode(), message);
    }

    public static <T> ServerResponse<T> success(T data) {
        return new ServerResponse<>(ResponseCodeEnum.SUCCESS.getCode(), data);
    }

    public static <T> ServerResponse<T> success(String message, T data) {
        return new ServerResponse<>(ResponseCodeEnum.SUCCESS.getCode(), message, data);
    }

    public static <T> ServerResponse<T> failed() {
        return new ServerResponse<>(ResponseCodeEnum.FAILED.getCode(), ResponseCodeEnum.FAILED.getMessage());
    }

    public static <T> ServerResponse<T> failed(String errorMessage) {
        return new ServerResponse<>(ResponseCodeEnum.FAILED.getCode(), errorMessage);
    }

    public static <T> ServerResponse<T> failed(int errorCode, String errorMessage) {
        return new ServerResponse<>(errorCode, errorMessage);
    }

    public static <T> ServerResponse<T> failed(int errorCode, String errorMessage, T data) {
        return new ServerResponse<>(errorCode, errorMessage, data);
    }
}
