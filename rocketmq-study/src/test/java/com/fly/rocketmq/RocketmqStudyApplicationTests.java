package com.fly.rocketmq;

import com.fly.rocketmq.client.order.Order;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;

@SpringBootTest
class RocketmqStudyApplicationTests {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Test
    void contextLoads() {
        Order order = new Order();
        order.setId("主键 id");
        order.setMessage("消息");
        Message<Order> objectMessage = new GenericMessage(order);
        rocketMQTemplate.syncSend("test", objectMessage);
    }

}
