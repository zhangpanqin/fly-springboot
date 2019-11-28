package com.fly.exception.controller;

import com.fly.exception.common.util.RetUtil;
import okhttp3.RequestBody;
import okhttp3.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author 张攀钦
 * @date 2019-11-16-09:10
 * @description
 */
@RestController
public class ThrowExceptionController {
    @CrossOrigin()
    @RequestMapping("/GetAssetMasterList1")
    public ResponseEntity<RetUtil> nothrowException(@RequestHeader(defaultValue = "1") Integer Authorization) {
        if (Authorization % 2 == 0) {
            return ResponseEntity.status(HttpStatus.OK).body(RetUtil.success());
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(RetUtil.success());
    }

    @CrossOrigin()
    @RequestMapping("/GenerateToken1")
    public ResponseEntity nothrowException2() {
        Map<String, String> map = new HashMap<>(16);
        map.put("accessToken", "2");
        return ResponseEntity.status(HttpStatus.OK).body(map);
    }

    @CrossOrigin()
    @RequestMapping("/GetAssetMasterList")
    public ResponseEntity nothrowException4(@RequestHeader String Authorization) throws IOException {
        MediaType JSON = MediaType.get("application/json; charset=utf-8");
        String url = "https://cbm.uberiq.net/uat-digihub/api/PropertyAsset/GetAssetMasterList";
        RequestBody requestBody = RequestBody.create(JSON, "{\"RequestIP\" : \"192.168.0.123\"}");
        OkHttpClient okHttpClient = new OkHttpClient.Builder().connectTimeout(10000, TimeUnit.MILLISECONDS).build();
        final Request request = new Request.Builder().url(url).addHeader("Authorization", Authorization).post(requestBody).build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            int code = response.code();
            if (code == 401) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
            }
            String string = response.body().string();
            return ResponseEntity.status(HttpStatus.OK).body(com.alibaba.fastjson.JSON.parse(string));
        }
    }

    @CrossOrigin()
    @RequestMapping("/GenerateToken")
    public ResponseEntity nothrowException3() throws IOException {
        MediaType JSON = MediaType.get("application/json; charset=utf-8");
        String url = "https://cbm.uberiq.net/uat-digihub/api/auth/GenerateToken";
        RequestBody requestBody = RequestBody.create(JSON, "{ \"client_id\" : \"da61297a1d8340be85c84a5455f3be59.digihub.com.ibase\" }");
        OkHttpClient okHttpClient = new OkHttpClient.Builder().connectTimeout(10000, TimeUnit.MILLISECONDS).build();
        final Request request = new Request.Builder().url(url).post(requestBody).build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            String string = response.body().string();
            return ResponseEntity.status(HttpStatus.OK).body(com.alibaba.fastjson.JSON.parse(string));
        }
    }
    @GetMapping("/exceptions/throw")
    public ResponseEntity<RetUtil> throwException(){
        throw  new RuntimeException("测试逻辑，故意抛出异常");
    }
}
