package com.lsdSpringCloud.service.serviceImpl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lsdSpringCloud.dao.LsdDemoMapper;
import com.lsdSpringCloud.entity.LsdDemo;
import com.lsdSpringCloud.service.LsdDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LsdDemoServiceImpl extends ServiceImpl<LsdDemoMapper, LsdDemo> implements LsdDemoService {
    @Autowired
    LsdDemoMapper lsdDemoMapper;
}
