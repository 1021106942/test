package com.by.service;

import com.by.entity.TJing;
import java.util.List;

/**
 * (TJing)表服务接口
 *
 * @author makejava
 * @since 2019-12-16 10:04:12
 */
public interface TJingService {

    /**
     * 通过ID查询单条数据
     *
     * @param jingId 主键
     * @return 实例对象
     */
    TJing queryById(Integer jingId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TJing> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tJing 实例对象
     * @return 实例对象
     */
    TJing insert(TJing tJing);

    /**
     * 修改数据
     *
     * @param tJing 实例对象
     * @return 实例对象
     */
    TJing update(TJing tJing);

    /**
     * 通过主键删除数据
     *
     * @param jingId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer jingId);

}