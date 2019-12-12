package com.enable;

import com.fly.config.JailProperties;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019-12-12-9:40
 * @description
 */
@Component
@Data
public class EnableConfiguration implements Serializable {
    private static final long serialVersionUID = 69658860649264808L;
    @Autowired
    private JailProperties jailProperties;
    private String name = "张攀钦";
}
