package com.fly.aop.controller;

import com.fly.aop.aop.annotation.AopAnnotation;
import com.fly.aop.entity.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 张攀钦
 * @date 2019-08-30-01:04
 * @description 测试数据校验
 */
@RestController
@Api
@Validated
public class ValidationController {

    @AopAnnotation
    @ApiOperation(value = "11")
    @PostMapping(value = "/users/1")
    public Map insertUser1() {
        HashMap ret = new HashMap(16);
        ret.put("data", "userDTO");
        return ret;
    }

    @ApiOperation(value = "11")
    @PostMapping(value = "/users/2")
    @AopAnnotation
    public Map insertUser2(@Validated UserDTO userDTO) {
        HashMap ret = new HashMap(16);
        ret.put("data", userDTO);
        return ret;
    }
}
