package com.w8.sunfch.springbootweb.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Data
@PropertySource(value = "classpath:my.properties")
public class SunEntity {

    @Value("${book.sunfch}")
    private String name;

    @Value("${book.classNum}")
    private String classNo;

    @Value("${book.ceshi}")
    private String test;
}
