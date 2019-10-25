package com.fly.validator.entity;

import javax.validation.constraints.NotNull;

/**
 * @author 张攀钦
 * @date 2019-10-24-17:50
 * @description
 */
public class UserDemo {
    @NotNull(message = "name 不能为空")
    private String name;
}
