package com.fly.jetcache.user;

import com.fly.jetcache.common.RetUtil;
import com.fly.jetcache.user.entity.UserDO;
import com.fly.jetcache.user.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.LongAdder;

/**
 * @author 张攀钦
 * @date 2019-12-19-14:59
 * @description
 */
@RestController
@Api
public class UserController {
    @Autowired
    private UserService userService;

    private LongAdder longAdder = new LongAdder();

    @GetMapping(value = "/users/{id}")
    public RetUtil<UserDO> findUserById(@PathVariable Integer id) throws InterruptedException {
        long start = System.currentTimeMillis();
        UserDO userDO = userService.selectUserById(id);
        long total = System.currentTimeMillis() - start;
        return RetUtil.success(userDO).message(String.valueOf(total));
    }

    @GetMapping(value = "/users/no-cache/{id}")
    public RetUtil<UserDO> findUserById2(@PathVariable Integer id) throws InterruptedException {
        long start = System.currentTimeMillis();
        UserDO userDO = userService.selectUserByIdNOCache(id);
        long total = System.currentTimeMillis() - start;
        return RetUtil.success(userDO).message(String.valueOf(total));
    }

    @PutMapping(value = "/users")
    public RetUtil<UserDO> updateUser(@RequestBody UserDO userDO) throws InterruptedException {
        long start = System.currentTimeMillis();
        userService.updateUser(userDO.getUserId(), userDO.getName());
        long total = System.currentTimeMillis() - start;
        return RetUtil.success(userDO).message(String.valueOf(total));
    }

    @PostMapping(value = "/users")
    public RetUtil<UserDO> insertUserDO(String name) throws InterruptedException {

        long start = System.currentTimeMillis();
        longAdder.increment();
        int i = longAdder.intValue();
        UserDO userDO = userService.insertUser(i, name);
        long total = System.currentTimeMillis() - start;
        return RetUtil.success(userDO).message(String.valueOf(total));


    }

    @DeleteMapping(value = "/users/{id}")
    public Object deleteUserById(@PathVariable Integer id) throws InterruptedException {
        return userService.deleteUser(id);
    }
}
