package com.tsien.mall.common.domain.enums;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/12 0012 11:25
 */

public enum ResponseCodeEnum {

    /**
     * 操作成功
     */
    SUCCESS(200, "操作成功"),

    /**
     * 暂未登录或登录凭证已过期
     */
    UNAUTHORIZED(401, "未登录或登录凭证已过期"),

    /**
     * 无权限，请求被禁止
     */
    FORBIDDEN(403, "无权限，请求被禁止"),

    /**
     * 请求失败，服务器无此资源
     */
    NOT_FOUND(404, "请求失败，服务器无此资源"),

    /**
     * 请求超时
     */
    REQUEST_TIMEOUT(408, "请求超时"),

    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),

    /**
     * 自定义状态码-操作失败
     */
    FAILED(700, "操作失败"),

    /**
     * 自定义状态码-参数错误
     */
    ILLEGAL_ARGUMENT(701, "参数错误"),

    /**
     * 自定义状态码-参数检验失败
     */
    VALIDATE_FAILED(702, "参数校验失败");


    private final int code;
    private final String message;

    ResponseCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
