package com.fly;

import lombok.SneakyThrows;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.ConfigurationFactory;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Order;
import org.apache.logging.log4j.core.config.plugins.Plugin;

@Plugin(name = "TxtConfigurationFactory", category = "ConfigurationFactory")
@Order(100)
public class TxtConfigurationFactory extends ConfigurationFactory {

    /**
     * Valid file extensions for XML files.
     */
    public static final String[] SUFFIXES = new String[]{".txt",};

    /**
     * Returns the Configuration.
     *
     * @param loggerContext The logger context.
     * @param source        The InputSource.
     * @return The Configuration.
     */
    @SneakyThrows
    @Override
    public Configuration getConfiguration(final LoggerContext loggerContext, final ConfigurationSource source) {
        AbstractConfigurationImpl abstractConfiguration = new AbstractConfigurationImpl(loggerContext, source);
        return abstractConfiguration;
    }

    /**
     * Returns the file suffixes for XML files.
     *
     * @return An array of File extensions.
     */
    public String[] getSupportedTypes() {
        return SUFFIXES;
    }
}