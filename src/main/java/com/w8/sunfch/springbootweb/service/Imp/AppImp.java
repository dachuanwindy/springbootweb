package com.w8.sunfch.springbootweb.service.Imp;

import com.alibaba.fastjson.JSON;
import com.w8.sunfch.springbootweb.entity.EmployeEntity;
import com.w8.sunfch.springbootweb.entity.StudentEntity;
import com.w8.sunfch.springbootweb.service.IApp;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Log4j2
public class AppImp implements IApp {
    @Override
    public String AppServiceTest(String str) {
        log.info("测试======");
        return str;
    }

    @Override
    public StudentEntity entity(@Validated StudentEntity studentEntity) {

        StudentEntity studentEntity1 = new StudentEntity();
        studentEntity.setTotalCount(100);
        log.info(JSON.toJSONString(studentEntity));
        return null;
    }


}
