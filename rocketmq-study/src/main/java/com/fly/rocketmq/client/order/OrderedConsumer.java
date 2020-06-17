package com.fly.rocketmq.client.order;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerOrderly;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

/**
 * @author zhangpanqin
 */
public class OrderedConsumer {
    public static void main(String[] args) throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("group4");

        consumer.setNamesrvAddr("localhost:9876");
        consumer.subscribe("TopicTestjjj", "order");

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