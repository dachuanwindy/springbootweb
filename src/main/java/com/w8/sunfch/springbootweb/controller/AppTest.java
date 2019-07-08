package com.w8.sunfch.springbootweb.controller;

import com.w8.sunfch.springbootweb.entity.EmployeEntity;
import com.w8.sunfch.springbootweb.entity.StudentEntity;
import com.w8.sunfch.springbootweb.service.IApp;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;

import javax.annotation.Resource;

@Log4j2
@RestController
@RequestMapping("app")
public class AppTest {

    @Resource
    private IApp appService;

    @RequestMapping(value = "test/{username}")
    public String test(@PathVariable String username) {
        return username + "您好";
    }


    @RequestMapping(value = "servicetest/{name}")
    public String serviceTest(@PathVariable String name) {
        String s = appService.AppServiceTest(name);
        s = "serviceTest:" + s;
        return s;
    }

    @RequestMapping(value = "employeer")
    public EmployeEntity getEmployeer(@Validated EmployeEntity employeEntity) {
        log.info("当前对象的值为：{}", JSON.toJSONString(employeEntity));
        return employeEntity;
    }


    @RequestMapping(value = "total")
    public StudentEntity studentEntity() {

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setTotalCount(100);
        appService.entity(studentEntity);
        return studentEntity;
    }
}
