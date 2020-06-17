package com.fly.rocketmq.order;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2020-02-09-08:42
 * @description
 */
@RestController
public class MessageSendController {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping(value = "/test")
    public String sendMessage(@RequestParam String message) {
        rocketMQTemplate.syncSend("order-test", message);
        return "success";
    }
}
