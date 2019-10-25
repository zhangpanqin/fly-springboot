package com.fly.test;

import cn.hutool.http.HttpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2019-10-24-16:32
 * @description
 */
@RestController
public class ShipController {

    @GetMapping(value = "/ships")
    public ResponseDataUtil listShips(){
        String s = HttpUtil.get("http://localhost:8081/ships");
        return ResponseDataUtil.ok(s);
    }
}
