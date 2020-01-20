package com.fly.jetcache.user.service.impl;

import com.fly.jetcache.user.entity.UserDO;
import com.fly.jetcache.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 张攀钦
 * @date 2019-12-19-15:01
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    private static final ConcurrentHashMap<Integer, UserDO> HASH_MAP = new ConcurrentHashMap(100);

    @Override
    public UserDO insertUser(int id, String name) throws InterruptedException {
        Thread.sleep(500);
        UserDO userDO = new UserDO();
        userDO.setUserId(id);
        userDO.setName(name);
        HASH_MAP.put(id, userDO);
        return userDO;
    }

    @Override
    public int deleteUser(int id) throws InterruptedException {
        Thread.sleep(500);
        HASH_MAP.remove(id);
        return 1;
    }

    @Override
    public UserDO updateUser(int id, String name) throws InterruptedException {
        Thread.sleep(500);
        UserDO userDO = new UserDO();
        userDO.setUserId(id);
        userDO.setName(name);
        HASH_MAP.put(id, userDO);
        return userDO;
    }

    @Override
    public UserDO selectUserById(int id) throws InterruptedException {
        System.out.println("查看刷新缓存");
        Thread.sleep(500);
        return HASH_MAP.get(id);
    }

    @Override
    public UserDO selectUserByIdNOCache(int id) throws InterruptedException {
        return HASH_MAP.get(id);
    }
}
