package com.ryan.springboot.dao;

import com.ryan.springboot.model.Demo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * demo Mapper接口
 *
 * @author ruanzz
 * @create 2018-07-14 10:09 PM
 **/
public interface DemoMapper extends Mapper<Demo> {

    List<Demo> getDemoByName(String name);
}
