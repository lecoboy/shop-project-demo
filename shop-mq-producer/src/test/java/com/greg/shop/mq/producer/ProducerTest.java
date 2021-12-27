package com.greg.shop.mq.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest(classes = ProducerApplication.class)
class ProducerTest {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Test
    void testSendMsg() {
        rocketMQTemplate.convertAndSend("shop", "Hello Springboot RocketMq");
        log.info("消息发送成功");
    }

}
