package com.fly.websocke.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author zhangpanqin
 */
@Slf4j
public class WebSocketHandle extends TextWebSocketHandler {

    /**
     * 处理客户端发送过来的消息
     */
    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        log.info(message.getPayload());
        session.sendMessage(message);
    }

    /**
     * 建立成功之后,加入链接
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        InetSocketAddress clientAddress = session.getRemoteAddress();
        WebSocketPostMessageComponent.addWebSocketSession(session);
    }

    /**
     * 断开连接之后,去掉链接
     */
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        WebSocketPostMessageComponent.removeWebSocketSession(session);
    }
}