package com.fly.exception.controller;

import com.fly.exception.common.util.RetUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2019-11-16-09:10
 * @description
 */
@RestController
public class ThrowExceptionController {

    @GetMapping("/exceptions/no-throw")
    public ResponseEntity<RetUtil> nothrowException(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(RetUtil.success());
    }

    @GetMapping("/exceptions/throw")
    public ResponseEntity<RetUtil> throwException(){
        throw  new RuntimeException("测试逻辑，故意抛出异常");
    }
}
