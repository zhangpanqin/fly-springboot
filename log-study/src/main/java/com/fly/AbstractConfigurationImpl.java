package com.fly;

import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.AbstractConfiguration;
import org.apache.logging.log4j.core.config.ConfigurationSource;

/**
 * @author 张攀钦
 * @date 2019-12-16-15:58
 * @description
 */
public class AbstractConfigurationImpl extends AbstractConfiguration {

    /**
     * Constructor.
     *
     * @param loggerContext
     * @param configurationSource
     */
    protected AbstractConfigurationImpl(LoggerContext loggerContext, ConfigurationSource configurationSource) {
        super(loggerContext, configurationSource);
    }
}
