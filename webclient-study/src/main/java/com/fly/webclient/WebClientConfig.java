package com.fly.webclient;

import org.springframework.context.annotation.Bean;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.http.client.reactive.ReactorResourceFactory;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import java.util.function.Function;

/**
 * @author 张攀钦
 * @date 2019-12-18-18:02
 * @description
 */
//@Configuration
public class WebClientConfig {
    @Bean
    public ReactorResourceFactory resourceFactory() {
        ReactorResourceFactory factory = new ReactorResourceFactory();
        factory.setUseGlobalResources(false);
        return factory;
    }

    @Bean
    public WebClient webClient(ReactorResourceFactory reactorResourceFactory) {

        Function<HttpClient, HttpClient> mapper = client -> {
//            client.
            return null;
        };

        ClientHttpConnector connector = new ReactorClientHttpConnector(reactorResourceFactory, mapper);

        return WebClient.builder().clientConnector(connector).build();
    }
}
