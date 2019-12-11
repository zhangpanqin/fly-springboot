package com.fly.websocke.stomp;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Controller
public class DemoController {
    @Autowired
    private SimpMessagingTemplate template;


    /**
     * 模拟公共新闻推送
     */
//    @Scheduled(fixedRateString="5000")
    public void mockPublicNews() {
        System.out.println("打印");

        List<String> list = new ArrayList<>();

        // 模拟产生3条
        list.add("清华大学16位学霸为一事现身PK 简历吓坏网友 - " + randomInt());
        list.add("闹市区树上长出6斤多蘑菇 保安大叔炒着吃了(图) - " + randomInt());
        list.add("女司机第2次上路撞死过路老人 教练被抓走 司法频道 - " + randomInt());


        // 广播消息，注意记住这里的地址
        template.convertAndSend("/topic/public_news", JSON.toJSONString(list));

    }

    /**
     * 模拟公共新闻推送
     */
    @Scheduled(fixedRateString = "5000")
    public void mockOtherNews() {
        System.out.println("打印");

        List<String> list = new ArrayList<>();

        // 模拟产生3条
        list.add("other1 - " + randomInt());
        list.add("other2 - " + randomInt());
        list.add("other3" + randomInt());


        // 广播消息，注意记住这里的地址
        template.convertAndSend("/queue/other", JSON.toJSONString(list));

    }

    @MessageMapping("/queue/other")
    public void otherSubscribe(@Payload String command) {
        System.out.println(command);
    }

    private int randomInt() {
        return new Random().nextInt(1000);
    }
}