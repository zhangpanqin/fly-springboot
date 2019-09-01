package com.fly.aop.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019-08-30-01:05
 * @description
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 654893876030244756L;

    @NotNull
    private String name;
}
