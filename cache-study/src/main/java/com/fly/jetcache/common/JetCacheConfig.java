package com.fly.jetcache.common;

import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张攀钦
 * @date 2019-12-19-14:54
 * @description jetcache 配置
 */
@Configuration
@EnableMethodCache(basePackages = {"com.fly"})
public class JetCacheConfig {

}
