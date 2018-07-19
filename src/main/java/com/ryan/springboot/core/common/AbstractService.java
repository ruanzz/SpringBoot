package com.ryan.springboot.core.common;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Service基础接口的实现类，基于通用Mapper实现，所有的service实现都要继承该类
 *
 * @author ruanzz
 * @create 2018-07-15 4:19 PM
 **/
public class AbstractService<T extends BaseModel> implements BaseService<T> {

    @Autowired
    protected BaseMapper<T> mapper;

    /**
     * 当前泛型真实类型的Class
     */
    private Class<T> modelClass;

    public AbstractService() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }

    @Override
    public Integer insert(T model) {
        return mapper.insertSelective(model);
    }

    @Override
    public Integer deleteById(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteByIds(String ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public Integer deleteByUuid(String uuid) {
        return mapper.deleteByUuid();
    }

    @Override
    public Integer update(T model) {
        return mapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public T selectById(String id) {
        return null;
    }

    @Override
    public T selectBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<T> selectListBy(String fieldName, Object value) {
        return null;
    }

    @Override
    public List<T> selectListByIds(String ids) {
        return null;
    }

    @Override
    public List<T> selectByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<T> selectAll() {
        return null;
    }

    @Override
    public List<T> select(T record) {
        return null;
    }

    @Override
    public T selectOne(T record) {
        return null;
    }
}
