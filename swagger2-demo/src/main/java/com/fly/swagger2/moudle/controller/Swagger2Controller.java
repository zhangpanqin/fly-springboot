package com.fly.swagger2.moudle.controller;

import com.fly.swagger2.common.util.ResponseUtil;
import com.fly.swagger2.moudle.enitity.UserDO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2019-10-10-12:25
 * @description
 */
@RestController
@Api(tags = {"角色管理"})
public class Swagger2Controller {
    @ApiOperation(value = "查询所有角色2", tags = {"角色管理"})
    @GetMapping(value = "/listRoles2")
    public ResponseUtil<UserDO> listRoles2() {
        UserDO userDO = new UserDO();
        return ResponseUtil.ok(userDO);
    }

    @ApiOperation(value = "查询所有角色2", tags = {"角色管理"})
    @GetMapping(value = "/listRoles1")
    public ResponseUtil<UserDO> listRoles1() {
        UserDO userDO = new UserDO();
        return ResponseUtil.ok(userDO);
    }
}
