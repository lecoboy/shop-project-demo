package com.greg.shop.service.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class ShopServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopServiceProviderApplication.class, args);
    }

}
