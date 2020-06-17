package com.fly.security;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * @author 张攀钦
 * @date 2020-05-06-16:22
 * tcpdump host www.baidu.com
 */
public class OkHttpTest {
    private static final OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) {

        Request request = new Request.Builder()
                .url("http://www.baidu.com")
                .get()
                .build();
        try (Response response = client.newCall(request).execute()) {
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
