package com.w8.sunfch.springbootweb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "test2")
@Slf4j
@Api(value = "User API接口", description = "User API接口")
public class App2TestController {

    @ApiOperation(value = "用户列表", notes = "查询用户列表")
    @ApiImplicitParam(name = "test2", value = "test", required = true)
    @RequestMapping(value = "app2",method = RequestMethod.GET)
    public String test2(String test) {
        log.info("这个是测试2的任务");
        return "test2";
    }


    @ApiOperation(value = "用户列表", notes = "查询用户列表")
    @GetMapping(value = "/list")
    public String getUserList(String pager) {
        return "[{'id':";
    }

}
