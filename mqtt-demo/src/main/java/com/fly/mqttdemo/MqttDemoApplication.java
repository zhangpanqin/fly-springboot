package com.fly.mqttdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MqttDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MqttDemoApplication.class, args);
		MqttPub.MyGateway gateway = context.getBean(MqttPub.MyGateway.class);
		gateway.sendToMqtt("foo");
	}

}
