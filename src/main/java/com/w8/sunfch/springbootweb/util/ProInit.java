package com.w8.sunfch.springbootweb.util;

import com.w8.sunfch.springbootweb.entity.SunEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Slf4j
public class ProInit {

    @Autowired
    private SunEntity sunEntity;

    @PostConstruct
    public void test() {

        System.out.println("初始化要加载的内容++++++++++++");
        log.info("=============");
        System.out.println("输出的名字是" + sunEntity.getName());

    }

    @PreDestroy
    public void test2() {
        System.out.println("---------------环境终止，内容释放----------");
    }
}
