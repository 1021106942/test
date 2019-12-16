package com.by.controller;

import com.by.entity.TJing;
import com.by.service.TJingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TJing)表控制层
 *
 * @author makejava
 * @since 2019-12-16 10:04:12
 */
@RestController
@RequestMapping("tJing")
public class TJingController {
    /**
     * 服务对象
     */
    @Resource
    private TJingService tJingService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TJing selectOne(Integer id) {
        return this.tJingService.queryById(id);
    }

}