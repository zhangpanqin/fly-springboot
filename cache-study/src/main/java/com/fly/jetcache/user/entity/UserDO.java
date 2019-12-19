package com.fly.jetcache.user.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019-12-19-15:11
 * @description
 */
@Data
public class UserDO implements Serializable {

    private static final long serialVersionUID = -1616342240737696780L;

    private Integer userId;
    private String name;
}
