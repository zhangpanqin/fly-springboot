package com.fly.exception;

import com.fly.exception.common.exception.StartException;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;
import org.springframework.boot.web.server.PortInUseException;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2019-11-15-18:26
 * @description
 */
@Component
public class MyFailureAnalyzerImpl {

    //    @Bean
    public String startThrowException() {
        throw new StartException("模拟启动异常");
    }
}
