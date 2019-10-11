package com.fly.web.springboot.web.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019-10-11-10:36
 * @description tomcat 配置参数文件
 */
@Data
public class MyTomcatProperties implements Serializable {
    private static final long serialVersionUID = 4173189014941463625L;
    private String ip;
    private Integer port;
}
