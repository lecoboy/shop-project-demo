package com.greg.springboot.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.greg.springboot.dubbo.api.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author greg
 * @version 2021/12/28 2:36
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Reference
    private HelloService helloService;

    @GetMapping("/sayHello")
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
