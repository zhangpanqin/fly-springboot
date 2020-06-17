package com.fly.rocketmq.client.transaction;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerOrderly;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 张攀钦
 * @date 2020-02-09-06:20
 * @description
 */
public class TransactionConsumer {
    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("group4");

        consumer.setNamesrvAddr("localhost:9876");
        consumer.subscribe("TopicTestjjj", "*");

        consumer.registerMessageListener(new MessageListenerOrderly() {
            @Override
            public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs,
                                                       ConsumeOrderlyContext context) {
                List<String> collect = msgs.stream().map(msg -> {
                    try {
                        return new String(msg.getBody(), "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    return null;
                }).collect(Collectors.toList());
                System.out.printf(Thread.currentThread().getName() + " Receive New Messages: " + collect + "%n");
                return ConsumeOrderlyStatus.SUCCESS;

            }
        });
        consumer.start();
        System.out.printf("Consumer Started.%n");
    }
}
