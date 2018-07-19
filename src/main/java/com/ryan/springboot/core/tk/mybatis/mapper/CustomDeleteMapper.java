package com.ryan.springboot.core.tk.mybatis.mapper;

import org.apache.ibatis.annotations.DeleteProvider;
import tk.mybatis.mapper.annotation.RegisterMapper;

@RegisterMapper
public interface CustomDeleteMapper<T> {
    @DeleteProvider(
            type = CustomDeleteProvider.class,
            method = "dynamicSQL"
    )
    int deleteByUuid(String uuid);
}