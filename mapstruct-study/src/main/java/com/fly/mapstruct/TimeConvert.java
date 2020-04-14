package com.fly.mapstruct;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * @author 张攀钦
 * @date 2020-03-31-17:38
 * 日期转换器
 */
public class TimeConvert {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    public String localDateTimeToString(LocalDateTime localDateTime) {
        if (Objects.isNull(localDateTime)) {
            return null;
        }
        return DATE_TIME_FORMATTER.format(localDateTime);
    }


    public LocalDateTime stringToLocalDateTime(String localDateTime) {
        if (Objects.isNull(localDateTime)) {
            return null;
        }
        return LocalDateTime.parse(localDateTime, DATE_TIME_FORMATTER);
    }
}
