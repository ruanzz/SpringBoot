package com.ryan.springboot.core.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 字符串工具
 *
 * @author ruanzz
 * @create 2018-07-15 9:36 PM
 **/
public class StringUtil {

    private static final Logger LOG = LoggerFactory.getLogger(StringUtil.class);

    /**
     * 判断为空，包含null
     *
     * @param value
     * @return
     */
    public static boolean isEmpty(CharSequence value) {
        return value == null || value.length() == 0;
    }

    /**
     * 判断非空
     *
     * @param value
     * @return
     */
    public static boolean isNotEmpty(CharSequence value) {
        return !isEmpty(value);
    }

    /**
     * 忽略大小写
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean equalsIgnoreCase(String a, String b) {
        if (a == null) {
            return b == null;
        } else {
            return a.equalsIgnoreCase(b);
        }
    }

    /**
     * 字符串转换数字
     *
     * @param in
     * @return 转换成功返回数字，否则返回null
     */
    public static Integer stringToInteger(String in) {
        if (in == null) {
            return null;
        } else {
            in = in.trim();
            if (in.length() == 0) {
                return null;
            } else {
                try {
                    return Integer.parseInt(in);
                } catch (NumberFormatException var2) {
                    LOG.warn("stringToInteger fail,string=" + in, var2);
                    return null;
                }
            }
        }
    }

}
