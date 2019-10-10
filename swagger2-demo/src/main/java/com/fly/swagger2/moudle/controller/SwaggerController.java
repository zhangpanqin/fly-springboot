package com.fly.swagger2.moudle.controller;

import com.fly.swagger2.common.util.ResponseUtil;
import com.fly.swagger2.moudle.enitity.UserDO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2019-10-10-11:42
 * @description 测试 swagger
 */
@RestController
@Api(tags = {"用户管理"})
public class SwaggerController {

    @GetMapping(value = "/users")
    public ResponseUtil<UserDO> listUsers(){
        UserDO userDO =new UserDO();
        return ResponseUtil.ok(userDO);
    }
    @GetMapping(value = "/roles")
    @ApiOperation(value = "查询所有角色",tags={"角色管理"})
    public ResponseUtil<UserDO> listRoles(){
        UserDO userDO =new UserDO();
        return ResponseUtil.ok(userDO);
    }
}
