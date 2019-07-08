package com.w8.sunfch.springbootweb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test2")
@Slf4j
public class App2TestController {

    @RequestMapping(value = "app2")
    public String test2() {
        log.info("这个是测试2的任务");
        return "test2";
    }
}
