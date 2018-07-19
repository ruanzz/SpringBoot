package com.ryan.springboot.core.utils;

import com.alibaba.fastjson.JSON;

/**
 * JSON工具类
 *
 * @author ruanzz
 * @create 2018-07-15 9:21 PM
 **/
public class JSONUtil {

    /**
     * 序列化为JSON对象
     *
     * @param object
     * @return
     */
    public static Object toJSON(Object object) {
        return JSON.toJSON(object);
    }

    /**
     * 将Java对象序列成字符串对象
     *
     * @param object
     * @return
     */
    public static String toJSONString(Object object) {
        return JSON.toJSONString(object);
    }


    /**
     * JSON 序列化为对象
     *
     * @param jsonStr
     * @param clazz
     * @return
     */
    public static <T> T fromJSON(String jsonStr, Class<T> clazz) {
        return JSON.parseObject(jsonStr, clazz);
    }
}
