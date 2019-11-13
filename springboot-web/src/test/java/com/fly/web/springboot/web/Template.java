package com.fly.web.springboot.web;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.resource.StringTemplateResourceLoader;
import org.junit.Test;


import java.io.IOException;

/**
 * @author 张攀钦
 * @date 2019-10-24-19:43
 * @description
 */
public class Template {


    @Test
    public void run1() throws IOException {
//初始化代码
        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
//获取模板
        org.beetl.core.Template t = gt.getTemplate("hello,${name}");
        t.binding("name", "beetl222");
//渲染结果
        String str = t.render();
        System.out.println(str);
    }
}
