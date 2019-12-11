package com.fly.websocke.sockjs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.*;

/**
 * Created by sang on 16-12-22.
 */
//@Configuration
//@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {


    @Bean
    public WebSocketHandler myHandler() {
        return new MyHandler();
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(myHandler(), "/endpointSang").setAllowedOrigins().withSockJS();
    }
}
