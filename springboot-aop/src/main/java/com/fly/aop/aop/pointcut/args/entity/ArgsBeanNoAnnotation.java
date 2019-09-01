package com.fly.aop.aop.pointcut.args.entity;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @author 张攀钦
 * @date 2019-09-01-19:10
 * @description
 */
@Data
public class ArgsBeanNoAnnotation {

    @NotNull
    private String name;
}
