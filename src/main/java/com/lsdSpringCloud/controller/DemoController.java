package com.lsdSpringCloud.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.lsdSpringCloud.entity.LsdDemo;
import com.lsdSpringCloud.service.LsdDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
    LsdDemoService lsdDemoService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello lsd";
    }

    @RequestMapping("/list")
    public List<LsdDemo> list(){
        return lsdDemoService.selectList(new Wrapper<LsdDemo>() {
            @Override
            public String getSqlSegment() {
                return null;
            }
        });
    }
}
