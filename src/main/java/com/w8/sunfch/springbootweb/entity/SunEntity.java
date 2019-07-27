package com.w8.sunfch.springbootweb.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class SunEntity {

    @Value("${sunfch}")
    private String name;

    @Value("${classNum}")
    private String classNo;
}
