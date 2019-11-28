package com.fly.async;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019-11-28-10:28
 * @description
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 2327245713028864994L;

    private String body;

    private String header1;

    private String headerNginx;

    private String cookie;

    private String authorization;
}
