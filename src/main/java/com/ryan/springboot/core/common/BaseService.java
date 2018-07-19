package com.ryan.springboot.core.common;

import org.apache.ibatis.exceptions.TooManyResultsException;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * Service基础接口，所有的Service都要实现这个接口
 *
 * @author ruanzz
 * @create 2018-07-15 4:09 PM
 **/
public interface BaseService<T> {

    /**
     * 插入数据
     *
     * @param model
     * @return
     */
    Integer insert(T model);

    /**
     * 根据id删除数据
     *
     * @param id
     * @return
     */
    Integer deleteById(Long id);

    /**
     * 根据ids批量删除数据，id使用英文逗号分割
     *
     * @param ids
     * @return
     */
    Integer deleteByIds(String ids);

    /**
     * 根据uuid删除数据
     *
     * @param uuid
     * @return
     */
    Integer deleteByUuid(String uuid);

    /**
     * 更新数据
     *
     * @param model
     * @return
     */
    Integer update(T model);

    /**
     * 通过id查找
     *
     * @param id
     * @return
     */
    T selectById(String id);

    /**
     * 通过Model中某个成员变量名称（非数据表中column的名称）查找,value需符合unique约束
     *
     * @param fieldName
     * @param value
     * @return
     * @throws TooManyResultsException
     */
    T selectBy(String fieldName, Object value) throws TooManyResultsException;

    /**
     * 通过Model中某个成员变量名称（非数据表中column的名称）查找
     *
     * @param fieldName
     * @param value
     * @return
     */
    List<T> selectListBy(String fieldName, Object value);

    /**
     * 通过ids查找数据，id使用英文逗号分割
     *
     * @param ids
     * @return
     */
    List<T> selectListByIds(String ids);

    /**
     * 根据条件查找
     *
     * @param condition
     * @return
     */
    List<T> selectByCondition(Condition condition);

    /**
     * 获取全表数据
     *
     * @return
     */
    List<T> selectAll();

    /**
     * 根据实体中的属性值进行查询，查询条件使用等号
     *
     * @param record
     * @return
     */
    List<T> select(T record);

    /**
     * 根据实体中的属性值进行查询，查询条件使用等号
     *
     * @param record
     * @return
     */
    T selectOne(T record);
}
