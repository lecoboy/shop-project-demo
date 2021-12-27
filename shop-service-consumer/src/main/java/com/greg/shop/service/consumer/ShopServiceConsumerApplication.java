package com.greg.shop.service.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class ShopServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopServiceConsumerApplication.class, args);
    }

}
