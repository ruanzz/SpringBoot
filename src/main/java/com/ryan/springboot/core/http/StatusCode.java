package com.ryan.springboot.core.http;

/**
 * 响应码
 *
 * @author ruanzz
 * @create 2018-07-15 8:53 PM
 **/
public enum StatusCode {
    /**
     * 成功
     */
    SUCCESS(200),
    /**
     * 失败
     */
    FAIL(400),
    /**
     * 未授权
     */
    UNAUTHORIZED(401),
    /**
     * 未认证
     */
    UNAUTHENTICATION(403),

    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500);

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    StatusCode(int code) {
        this.code = code;
    }
}
