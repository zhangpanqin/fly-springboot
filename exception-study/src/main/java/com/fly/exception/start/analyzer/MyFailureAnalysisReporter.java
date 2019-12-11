package com.fly.exception.start.analyzer;

import com.fly.exception.service.EmailService;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalysisReporter;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 张攀钦
 * @date 2019-11-16-18:53
 * @description 自定义 FailureAnalysisReporter 处理异常
 * 此对象不会被 ioc 容器管理，SpringFactoriesLoader 加载的
 */
public class MyFailureAnalysisReporter implements FailureAnalysisReporter {

    private EmailService emailService;


    public MyFailureAnalysisReporter() {
        emailService = new EmailService();
    }

    @Override
    public void report(FailureAnalysis analysis) {
        final Throwable cause = analysis.getCause();
        final String message = cause.getMessage();
        emailService.sendEmail(String.join("", "异常原因：", message));
    }

}
