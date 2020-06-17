package com.fly.rocketmq.client.order;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.MQProducer;
import org.apache.rocketmq.client.producer.MessageQueueSelector;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.selector.SelectMessageQueueByHash;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.remoting.common.RemotingHelper;

import java.util.List;

public class OrderedProducer {
    public static void main(String[] args) throws Exception {
        //Instantiate with a producer group name.
        DefaultMQProducer producer = new DefaultMQProducer("group4");
        //Launch the instance.
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        for (int i = 0; i < 3; i++) {
            String orderId = i + "";
            for (int j = 0; j < 5; j++) {
                Order build = Order.builder().id(orderId).message("步骤:-" + j).build();
                //Create a message instance, specifying topic, tag and message body.
                Message msg = new Message("TopicTestjjj", "order", "KEY" + i,
                        build.toString().getBytes(RemotingHelper.DEFAULT_CHARSET));
                SendResult sendResult = producer.send(msg, new SelectMessageQueueByHash(), orderId);
                System.out.printf("%s%n", sendResult);
            }
        }
        //server shutdown
        producer.shutdown();
    }
}