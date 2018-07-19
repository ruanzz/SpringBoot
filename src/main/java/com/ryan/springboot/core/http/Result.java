package com.ryan.springboot.core.http;


import com.ryan.springboot.core.utils.JSONUtil;

import java.io.Serializable;

/**
 * 返回结果集
 *
 * @author ruanzz
 * @create 2018-07-15 8:51 PM
 **/
public class Result<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    public Result<T> setCode(StatusCode statusCode) {
        this.code = statusCode.getCode();
        return this;
    }

    public int getCode() {
        return code;
    }

    public Result<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Result<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSONUtil.toJSONString(this);
    }
}
