package com.w8.sunfch.springbootweb.entity;

import lombok.Data;

import javax.validation.constraints.DecimalMax;

@Data
public class StudentEntity {

    private String className;

    @DecimalMax(value = "50", message = "最大数量不能超过50")
    private int totalCount;

    private String iphone;

}
