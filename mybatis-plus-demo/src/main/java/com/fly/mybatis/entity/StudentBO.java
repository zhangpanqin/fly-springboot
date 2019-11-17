package com.fly.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 张攀钦
 * @date 2019-11-17-21:57
 * @description
 */
@Data
public class StudentBO implements Serializable {
    private static final long serialVersionUID = 8602338230432284019L;

    private Integer id;


    private String studentName;


    private Integer age;

    List<Course> lists;
}
