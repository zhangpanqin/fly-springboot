package com.fly.validator.service;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

/**
 * @author 张攀钦
 * @date 2019-10-24-17:41
 * @description
 */
@Service
public class UserServiceImpl {
    public String log(@Valid @Length(max = 5) String name){
        return name;
    }
}
