package com.ryan.springboot.core.tk.mybatis.mapper;

import org.apache.ibatis.mapping.MappedStatement;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;
import tk.mybatis.mapper.mapperhelper.SqlHelper;

/**
 * 拓展通用mapper删除
 *
 * @author ruanzz
 * @create 2018-07-15 4:46 PM
 **/
public class CustomDeleteProvider extends MapperTemplate {
    public CustomDeleteProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    public String deleteByUuid(MappedStatement ms) {
        Class<?> entityClass = this.getEntityClass(ms);
        StringBuilder sql = new StringBuilder();
        sql.append(SqlHelper.deleteFromTable(entityClass, this.tableName(entityClass)));
        sql.append("<where>");
        sql.append(this.tableName(entityClass) + ".uuid_=");
        sql.append("</where>");
        return sql.toString();
    }
}
