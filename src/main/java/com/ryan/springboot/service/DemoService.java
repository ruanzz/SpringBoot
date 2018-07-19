package com.ryan.springboot.service;

import com.ryan.springboot.dao.DemoMapper;
import com.ryan.springboot.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * demo service
 *
 * @author ruanzz
 * @create 2018-07-14 11:03 PM
 **/
@Service
public class DemoService {
    @Autowired
    private DemoMapper mapper;

    public List<Demo> getDemoByName(String name) {
        return mapper.getDemoByName(name);
    }
}
