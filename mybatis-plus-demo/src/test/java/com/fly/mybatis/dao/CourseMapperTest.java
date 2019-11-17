package com.fly.mybatis.dao;

import com.fly.mybatis.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author 张攀钦
 * @date 2019-11-17-21:54
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseMapperTest {
    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void run1() {
        final Course course = courseMapper.selectById(1);
        System.out.println(course);
    }

}