package com.fly.websocke.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 张攀钦
 * @date 2020-07-01-10:23
 */
@Component
@Slf4j
public class WebSocketPostMessageComponent {
    private static final ConcurrentHashMap<String, WebSocketSession> WEB_SOCKET_SESSION = new ConcurrentHashMap<>(255);

    @Async
    public void sendAllMessage(TextMessage textMessage) {
        WEB_SOCKET_SESSION.forEach((sessionId, webSocketSession) -> {
            if (webSocketSession.isOpen()) {
                try {
                    webSocketSession.sendMessage(textMessage);
                } catch (IOException e) {
                    log.error("发送群发消息失败", e);
                }
                return;
            }
            WEB_SOCKET_SESSION.remove(sessionId);
        });
    }

    public static boolean addWebSocketSession(WebSocketSession webSocketSession) {
        if (Objects.isNull(webSocketSession)) {
            return false;
        }
        if (webSocketSession.isOpen()) {
            final String id = webSocketSession.getId();
            WEB_SOCKET_SESSION.put(id, webSocketSession);
            return true;
        }
        return false;
    }

    public static boolean removeWebSocketSession(WebSocketSession webSocketSession) {
        if (Objects.isNull(webSocketSession)) {
            return false;
        }
        WEB_SOCKET_SESSION.remove(webSocketSession.getId());
        return true;
    }
}
