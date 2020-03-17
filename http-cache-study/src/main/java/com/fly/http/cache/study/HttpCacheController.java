package com.fly.http.cache.study;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerRequest;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author 张攀钦
 * @date 2020-03-02-21:52
 * @description http 缓存
 */
@RestController
public class HttpCacheController {

    @GetMapping("/no-cache/png")
    public void noCachePng(HttpServletResponse response) throws IOException {
        response.setHeader("Content-Type","image/png");
        response.setHeader("Cache-Control","public,max-age=5");
        ServletOutputStream outputStream = response.getOutputStream();
        ClassPathResource classPathResource = new ClassPathResource("static/a.png");
        InputStream inputStream = classPathResource.getInputStream();
        IOUtils.copy(inputStream,outputStream);
        inputStream.close();
    }
}
