package com.fly.spring.resource;

import cn.hutool.core.io.IoUtil;
import org.junit.Test;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 张攀钦
 * @date 2019-10-30-16:02
 * @description
 */
public class UrlResourceStudy {
    @Test
    public void run2() throws IOException {
        UrlResource urlResource = new UrlResource("http://www.thingjs.com/guide/");
        InputStream inputStream = urlResource.getInputStream();
        System.out.println(IoUtil.read(inputStream, "UTF-8"));
    }

}
