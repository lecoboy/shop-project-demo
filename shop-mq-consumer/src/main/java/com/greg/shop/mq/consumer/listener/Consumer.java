package com.greg.shop.mq.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author greg
 * @version 2021/12/27 22:45
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "shop", consumerGroup = "my-group")
public class Consumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        log.info("收到消息: " + message);
    }
}
