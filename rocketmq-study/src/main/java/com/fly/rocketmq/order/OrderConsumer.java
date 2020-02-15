package com.fly.rocketmq.order;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2020-02-09-08:43
 * @description
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "order-test",consumerGroup = "test")
public class OrderConsumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        log.info("消费的消息:{}",message);
    }
}
