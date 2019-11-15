package com.fly.exception;

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
public class MyFailureAnalyzerImpl implements FailureAnalyzer {

    /**
     * Returns an analysis of the given {@code failure}, or {@code null} if no analysis
     * was possible.
     *
     * @param failure the failure
     * @return the analysis or {@code null}
     */
    @Override
    public FailureAnalysis analyze(Throwable failure) {
        return new FailureAnalysis("", "", failure);
    }

    @Bean
    public String getMyTomcatProperties2() {
        throw new PortInUseException(8080);
    }
}
