package com.ryan.springboot.model;

import com.ryan.springboot.core.common.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * demo类
 *
 * @author ruanzz
 * @create 2018-07-14 10:07 PM
 **/
@Entity
@Table(name = "demo")
public class Demo extends BaseModel {
    @Column(name = "desc_")
    private String desc;

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
