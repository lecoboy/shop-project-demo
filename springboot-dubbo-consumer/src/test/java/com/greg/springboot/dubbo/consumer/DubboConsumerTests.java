package com.greg.springboot.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.greg.springboot.dubbo.api.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DubboConsumerTests {

    @Reference
    private HelloService helloService;

    @Test
    void testHello() {
        System.out.println(helloService.sayHello("zhangsan"));
    }

}
