package com.fly.validator;

import com.fly.validator.entity.UserDemo;
import com.fly.validator.util.RetUtil;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * @author 张攀钦
 * @date 2019/11/17-17:18
 * 测试校验信息
 */

@RestController
@Validated
public class TestController {

    @GetMapping("test1")
    public String test1(@NotBlank(message = "{notEmpty}") String name) {
        return "success";
    }

    @GetMapping("test2")
    @ResponseStatus(HttpStatus.CREATED)
    public RetUtil<UserDemo> test2(@Valid UserDemo userDemo) {
        return RetUtil.success(userDemo);
    }
}