package com.fly.spring.init;

import com.fly.spring.factory.MyBeanPostProcessor;
import com.fly.spring.imp.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 张攀钦
 * @date 2019/11/17-12:41
 * 配置主类
 */
@Configuration
@Import(value = {BirdConfig.class})
public class WebConfig {


}
