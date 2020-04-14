package com.fly.http.cache.study;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2020-04-01-23:11
 */
@Data
public class IpData implements Serializable {
    private static final long serialVersionUID = -7358622400223213450L;

    private String xRealIp;

    private String XForwardFor;
}
