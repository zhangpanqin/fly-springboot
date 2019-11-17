package com.fly.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fly.mybatis.entity.StudentBO;
import com.fly.mybatis.entity.Sudent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 张攀钦
 * @date 2019-11-17-21:49
 * @description ${description}
 */
@Mapper
public interface SudentMapper extends BaseMapper<Sudent> {

    StudentBO findStudentBO(@Param("id") Integer id);
}