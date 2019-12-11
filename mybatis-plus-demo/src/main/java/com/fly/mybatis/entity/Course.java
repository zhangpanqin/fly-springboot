package com.fly.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * @author 张攀钦
 * @date 2019-11-17-21:49
 * @description ${description}
 */
@Data
@TableName(value = "course")
public class Course implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "course_name")
    private String courseName;

    private static final long serialVersionUID = 1L;
}