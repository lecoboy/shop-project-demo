package com.greg.springboot.rocketmq.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SpringbootRocketmqProducerApplicationTests {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Test
    void testSendMsg() {
        rocketMQTemplate.convertAndSend("springboot-rockcetmq", "Hello Springboot RocketMq");
        log.info("消息发送成功");
    }

}
