package com.fly.spring.resource;

import cn.hutool.core.io.IoUtil;
import com.fly.spring.imp.ImpDemo1;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassRelativeResourceLoader;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 张攀钦
 * @date 2019-11-30-11:46
 * @description ClassRelativeResourceLoader 读取某个类所在包下面的资源
 */
public class ClassRelativeResourceLoaderTest {
    @Test
    public void run11() throws IOException {
        final ClassRelativeResourceLoader classRelativeResourceLoader = new ClassRelativeResourceLoader(ImpDemo1.class);
        final Resource resource = classRelativeResourceLoader.getResource("demo.txt");
        final InputStream inputStream = resource.getInputStream();
        System.out.println(IoUtil.read(inputStream, "utf-8"));
    }

}
