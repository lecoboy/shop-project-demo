package com.greg.shop.service.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.greg.shop.service.api.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author greg
 * @version 2021/12/28 1:56
 */
@Component
@Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
