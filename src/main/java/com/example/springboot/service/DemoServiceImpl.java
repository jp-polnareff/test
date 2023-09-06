package com.example.springboot.service;

import com.example.springboot.dao.DemoMapper;
import com.example.springboot.domain.Demo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl {
    @Resource
    private DemoMapper demoMapper;

    public Demo getDemoById(String id) {
        return demoMapper.selectById(id);
    }

    public void insertDemo(Demo demo) {
        demoMapper.insert(demo);
    }

    public void updateDemo(Demo demo) {
        demoMapper.updateById(demo);
    }

    public void deleteDemo(String id) {
        demoMapper.deleteById(id);
    }
}

