package com.fly.websocke.sockjs;

import org.springframework.http.HttpHeaders;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.security.Principal;

/**
 * @author 张攀钦
 */
public class MyHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        System.out.println(session.getUri());
        final HttpHeaders handshakeHeaders = session.getHandshakeHeaders();
        System.out.println(handshakeHeaders.get("Host"));
        final Principal principal = session.getPrincipal();
        System.out.println(principal);
        System.out.println(session.getAttributes());
        final TextMessage textMessage = new TextMessage("123张攀钦".getBytes("UTF-8"));
        session.sendMessage(textMessage);
        System.out.println(message.getPayload());
    }

}