package com.fly.mqttdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2020-06-17-09:31
 * mqtt发送
 */
@RestController
public class MqttController {
    @Autowired
    private MqttPub.MyGateway myGateway;

    @GetMapping(value = "/mqtt/send")
    public String sendMqtt(String topic, String payload) {
        myGateway.sendToMqtt(payload, topic);
        return "success";
    }
}
