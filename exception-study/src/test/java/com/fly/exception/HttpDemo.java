package com.fly.exception;

import okhttp3.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * @author 张攀钦
 * @date 2019-11-27-15:43
 * @description
 */
public class HttpDemo {

    @Test
    public void test1() throws IOException {
        MediaType JSON = MediaType.get("application/json; charset=utf-8");
        String url = "https://cbm.uberiq.net/uat-digihub/api/auth/GenerateToken";
        RequestBody requestBody = RequestBody.create(JSON, "{ \"client_id\" : \"da61297a1d8340be85c84a5455f3be59.digihub.com.ibase\" }");
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder().url(url).post(requestBody).build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            System.out.println(response.body().string());
        }
    }
}
