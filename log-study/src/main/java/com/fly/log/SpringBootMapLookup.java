package com.fly.log;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.lookup.AbstractLookup;
import org.apache.logging.log4j.core.lookup.StrLookup;


@Plugin(name = SpringBootMapLookup.LOGGING_FILE, category = StrLookup.CATEGORY)
public class SpringBootMapLookup extends AbstractLookup {
    public static final String LOGGING_FILE = "loggingFile";

    @Override
    public String lookup(final LogEvent event, final String key) {
        return SpringBootLog4j2Configuration.getLoggingFileValue(key);
    }
}