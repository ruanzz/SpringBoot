package com.ryan.springboot.core.http;

/**
 * rest 返回实体,将结果集进行封装
 *
 * @author ruanzz
 * @create 2018-07-15 8:48 PM
 **/
public class Respone {
    private static final String SUCCESS = "success";


    public static <T> Result<T> ok() {
        return new Result<T>().setCode(StatusCode.SUCCESS).setMsg(SUCCESS);
    }

    public static <T> Result<T> ok(T data) {
        return new Result<T>().setCode(StatusCode.SUCCESS).setMsg(SUCCESS).setData(data);
    }

    public static <T> Result<T> error(String message) {
        return build(StatusCode.FAIL.getCode(), SUCCESS);
    }

    public static <T> Result<T> build(int code, String msg) {
        return new Result<T>().setCode(code).setMsg(msg);
    }

    public static <T> Result<T> build(int code, String msg, T data) {
        return new Result<T>().setCode(code).setMsg(msg).setData(data);
    }

}
