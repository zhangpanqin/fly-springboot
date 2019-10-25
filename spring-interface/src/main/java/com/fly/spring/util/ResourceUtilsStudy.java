package com.fly.spring.util;

import cn.hutool.core.io.IoUtil;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;

import java.io.*;

/**
 * @author 张攀钦
 * @date 2019-10-25-17:22
 * @description ResourceUtils 学习
 * * @see org.springframework.core.io.Resource
 * * @see org.springframework.core.io.ClassPathResource
 * * @see org.springframework.core.io.FileSystemResource
 * * @see org.springframework.core.io.UrlResource
 * * @see org.springframework.core.io.ResourceLoader
 */
public class ResourceUtilsStudy {
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

    /**
     * 获取 classpath 开头
     */
    @Test
    public void getFile() throws FileNotFoundException {
        File file = ResourceUtils.getFile("classpath:demo/application.txt");
        String read = IoUtil.read(new FileInputStream(file), "UTF-8");
        System.out.println(read);
    }

    /**
     * 获取 file 开头
     */
    @Test
    public void getFile2() throws FileNotFoundException {
        File file = ResourceUtils.getFile("classpath:demo/application.txt");
        String read = IoUtil.read(new FileInputStream(file), "UTF-8");
        System.out.println(read);
    }
}
