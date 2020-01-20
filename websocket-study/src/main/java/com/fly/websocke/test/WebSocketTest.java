package com.fly.websocke.test;

import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author 张攀钦
 * @date 2020-01-14-10:03
 * @description websocket 测试
 */
public class WebSocketTest {

    public static void main(String[] args) throws URISyntaxException {
        String host = "0.0.0.0";
        int port = 8887;
        WebSocketServer server = new SimpleServer(new InetSocketAddress(host, port));
        server.run();
        WebSocketServer server2 = new SimpleServer(new InetSocketAddress(host, 8888));
        server2.run();
    }

}
