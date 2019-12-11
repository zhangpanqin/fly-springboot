package com.fly.mybatis.dao;

import com.fly.mybatis.entity.StudentBO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author 张攀钦
 * @date 2019-11-17-22:15
 * @description
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SudentMapperTest {

    @Autowired
    private SudentMapper sudentMapper;

    @Test
    public void findStudentBO() {
        final StudentBO studentBO = sudentMapper.findStudentBO(1);
        System.out.println(studentBO);
    }
}