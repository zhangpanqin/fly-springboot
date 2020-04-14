package com.fly.mapstruct;

import org.mapstruct.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * @author 张攀钦
 * @date 2020-03-31-17:38
 * 日期转换器
 */

public class TimeConvert2 {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @TimeToString
    public String localDateTimeToString(LocalDateTime localDateTime) {
        if (Objects.isNull(localDateTime)) {
            return null;
        }
        return DATE_TIME_FORMATTER.format(localDateTime);
    }

    @StringToTime
    public LocalDateTime stringToLocalDateTime(String localDateTime) {
        if (Objects.isNull(localDateTime)) {
            return null;
        }
        return LocalDateTime.parse(localDateTime, DATE_TIME_FORMATTER);
    }

    @Qualifier
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimeToString {
    }

    @Qualifier
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface StringToTime {
    }
}
