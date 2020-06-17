package com.fly.async;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019-11-27-21:47
 * @description 测试注解
 */
@Data
public class UserDTO implements Serializable {
    private static final long serialVersionUID = -5017163415999322950L;

    private String name;

    public static void main(String[] args) {

    }
}
