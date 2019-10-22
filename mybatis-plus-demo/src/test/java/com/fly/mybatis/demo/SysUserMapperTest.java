package com.fly.mybatis.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 张攀钦
 * @date 2019-10-22-11:16
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserMapperTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void insertUser() {
        UserInfo userInfo = new UserInfo();
        userInfo.setAge("1");
        userInfo.setId(2);
        userInfo.setName("username");
        SysUser demo = SysUser.builder().sexEnum("1").sysAge((byte) 1).sysName("测试").extJson(userInfo).build();
        sysUserMapper.insert(demo);

    }
    
    @Test
    public void selectAll() {
        SysUser sysUser = sysUserMapper.selectById(1);
        System.out.println(sysUser);
    }

    @Test
    public void run4() {
        System.out.println(sysUserMapper.selectBy());
    }


}
