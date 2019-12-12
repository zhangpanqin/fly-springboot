package com.fly.log;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author 张攀钦
 * @date 2019-12-12-19:04
 * @description
 */
@Component
public class SpringBootLog4j2Configuration implements ApplicationListener<ApplicationEnvironmentPreparedEvent>, Ordered {


    private static Environment environment;

    private static final String LOGGING = "logging.file.";

    public static String getLoggingFileValue(String key) {
        if (Objects.isNull(key)) {
            return "null";
        }
        return environment.getProperty(LOGGING + key);
    }

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        environment = event.getEnvironment();
    }


    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
