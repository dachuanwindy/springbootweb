package com.w8.sunfch.springbootweb.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;

@Data
@Accessors(chain = true)
public class EmployeEntity {

    @NotNull(message = "字段不能为空")
    public String username;

    private int age;

    @DecimalMax(value = "30", message = "最大长度不能超过2")
    private int sex = 12;

}
