package com.fly.aop.aop.pointcut.args.entity;

import com.fly.aop.aop.pointcut.args.annotation.ArgsTest;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @author 张攀钦
 * @date 2019-09-01-19:10
 * @description
 */
@ArgsTest
@Data
public class ArgsBean {

    @NotNull
    private String name;
}
