package com.fly.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @author 张攀钦
 * @date 2019-12-18-17:28
 * @description
 */
@RestController
public class WebClientService {

    @Autowired
    private WebClient.Builder webClient;

    @GetMapping(value = "/demo")
    public Object get() {
        long l = System.currentTimeMillis();
        Mono<String> name1 = webClient.build().get().uri("http://www.thingjs.com/guide/").header("name", "1").retrieve().bodyToMono(String.class);
        String block = name1.block();
        Mono<String> name2 = webClient.build().get().uri("http://www.thingjs.com/guide/").header("name", "1").retrieve().bodyToMono(String.class);
        String block2 = name2.block();
        long l1 = System.currentTimeMillis() - l;
        System.out.println(l1);
        return String.valueOf(l1).concat(block).concat(block2);
    }

    @GetMapping(value = "/demo2")
    public Object get2() {
        long l = System.currentTimeMillis();
        Mono<String> name1 = webClient.build().get().uri("http://www.thingjs.com/guide/").header("name", "1").retrieve().bodyToMono(String.class);
        Mono<String> name2 = webClient.build().get().uri("http://www.thingjs.com/guide/").header("name", "1").retrieve().bodyToMono(String.class);
        String block = Mono.zip(name1, name2, (name3, name4) -> {
            return name3.concat(name4);
        }).block();
        long l1 = System.currentTimeMillis() - l;
        System.out.println(l1);
        return String.valueOf(l1).concat(block);
    }
}
