package com.w8.sunfch.springbootweb.util;

import com.w8.sunfch.springbootweb.entity.SunEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Slf4j
public class ProInit {

    @Autowired
    private SunEntity sunEntity;

    @Autowired
    private Environment environment;

    @PostConstruct
    public void test() {

        System.out.println("初始化要加载的内容++++++++++++");
        log.info("=============");
        System.out.println("输出的名字是" + sunEntity.getName());

        /**可以通过环境变量获取值，Spring 将properties中的值变成了Spring的内部变量了*/
        String property = environment.getProperty("book.sunfch");
        System.out.println("通过环境变量获取值====" + property);

    }

    @PreDestroy
    public void test2() {
        System.out.println("---------------环境终止，内容释放----------");
    }
}
