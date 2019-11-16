package com.fly.exception.start.analyzer;

import com.fly.exception.common.exception.StartException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2019-11-16-17:15
 * @description
 */
public class StartExceptionFailureAnalyzer extends AbstractFailureAnalyzer<RuntimeException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, RuntimeException cause) {
        Throwable rootCause = cause.getCause();
        if (rootCause instanceof StartException) {
            return new FailureAnalysis("测试启动异常","",rootCause);
        }
        return null;
    }
}
