package com.fly.spring.utils;

import cn.hutool.core.io.IoUtil;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 张攀钦
 * @date 2019-10-24-17:15
 * @description
 */
public class ClassUtilsTest {

    @Test
    public void run() throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("demo/application.properties");
        InputStream inputStream = classPathResource.getInputStream();
        String read = IoUtil.read(inputStream, "UTF-8");
        System.out.println(read);
    }

    @Test
    public void run3() throws IOException {
        ClassPathResource urlResource = new ClassPathResource("demo/application.txt");
        InputStream inputStream = urlResource.getInputStream();
        String read = IoUtil.read(inputStream, "UTF-8");
        System.out.println(read);
    }
}
