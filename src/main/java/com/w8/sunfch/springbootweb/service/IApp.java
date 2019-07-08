package com.w8.sunfch.springbootweb.service;

import com.w8.sunfch.springbootweb.entity.StudentEntity;
import org.springframework.validation.annotation.Validated;

public interface IApp {

    String AppServiceTest(String str);

    StudentEntity entity(@Validated StudentEntity studentEntity);
}
