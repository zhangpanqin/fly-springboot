package com.fly.jetcache.user.service;

import com.alicp.jetcache.anno.*;
import com.fly.jetcache.user.entity.UserDO;

/**
 * @author 张攀钦
 * @date 2019-12-19-15:00
 * @description
 */

public interface UserService {
    String USER_CACHE = "userCache";

    UserDO insertUser(int id, String name) throws InterruptedException;

    @CacheInvalidate(name = UserService.USER_CACHE, key = "#id")
    int deleteUser(int id) throws InterruptedException;

    @CacheUpdate(name = UserService.USER_CACHE, key = "#id", value = "#result")
    UserDO updateUser(int id, String name) throws InterruptedException;

    @Cached(name = UserService.USER_CACHE, key = "#id", expire = 20, cacheType = CacheType.LOCAL, cacheNullValue = true)
//    过一段时间会执行方法刷新缓存
    @CacheRefresh(refresh = 70)
    UserDO selectUserById(int id) throws InterruptedException;

    @Cached(area = "hula", name = UserService.USER_CACHE, key = "#id", expire = 1800, cacheType = CacheType.LOCAL)
    UserDO selectUserByIdNOCache(int id) throws InterruptedException;
}
