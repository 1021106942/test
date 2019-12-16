package com.by.service.impl;

import com.by.entity.TJing;
import com.by.dao.TJingDao;
import com.by.service.TJingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TJing)表服务实现类
 *
 * @author makejava
 * @since 2019-12-16 10:04:12
 */
@Service("tJingService")
public class TJingServiceImpl implements TJingService {
    @Resource
    private TJingDao tJingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param jingId 主键
     * @return 实例对象
     */
    @Override
    public TJing queryById(Integer jingId) {
        return this.tJingDao.queryById(jingId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TJing> queryAllByLimit(int offset, int limit) {
        return this.tJingDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tJing 实例对象
     * @return 实例对象
     */
    @Override
    public TJing insert(TJing tJing) {
        this.tJingDao.insert(tJing);
        return tJing;
    }

    /**
     * 修改数据
     *
     * @param tJing 实例对象
     * @return 实例对象
     */
    @Override
    public TJing update(TJing tJing) {
        this.tJingDao.update(tJing);
        return this.queryById(tJing.getJingId());
    }

    /**
     * 通过主键删除数据
     *
     * @param jingId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer jingId) {
        return this.tJingDao.deleteById(jingId) > 0;
    }
}