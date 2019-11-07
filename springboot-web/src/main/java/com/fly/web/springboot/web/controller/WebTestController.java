package com.fly.web.springboot.web.controller;

import com.fly.web.springboot.web.common.util.RetUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2019-08-21-11:12
 * @description 测试 servlet filter listener interceptor
 */
@RestController
@Api(value = "测试接口", tags = "测试接口")
@Slf4j
public class WebTestController {

    @RequestMapping(value = "/test")
    @ApiOperation(value = "测试接口")
    public RetUtil test(@RequestBody String body) {
        log.info("WebTestController.test ----- 执行");
        return RetUtil.build().code(200).data(body).message("测试接口");
    }

    @Autowired
    @GetMapping(value = "/test1")
    public RetUtil test2() {
        return RetUtil.success();
    }
}
