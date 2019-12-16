package com.by.dao;

import com.by.entity.TJing;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TJing)表数据库访问层
 *
 * @author makejava
 * @since 2019-12-16 10:04:12
 */
public interface TJingDao {

    /**
     * 通过ID查询单条数据
     *
     * @param jingId 主键
     * @return 实例对象
     */
    TJing queryById(Integer jingId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TJing> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tJing 实例对象
     * @return 对象列表
     */
    List<TJing> queryAll(TJing tJing);

    /**
     * 新增数据
     *
     * @param tJing 实例对象
     * @return 影响行数
     */
    int insert(TJing tJing);

    /**
     * 修改数据
     *
     * @param tJing 实例对象
     * @return 影响行数
     */
    int update(TJing tJing);

    /**
     * 通过主键删除数据
     *
     * @param jingId 主键
     * @return 影响行数
     */
    int deleteById(Integer jingId);

}