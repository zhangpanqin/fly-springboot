package com.fly.mybatis.demo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019-10-22-10:50
 * @description ${description}
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_user",autoResultMap = true)
public class SysUser implements Serializable {
    @TableId(value = "sys_id", type = IdType.AUTO)
    private Integer sysId;

    @TableField(value = "sys_name")
    private String sysName;

    @TableField(value = "sys_age")
    private Byte sysAge;

    @TableField(value = "sex_enum")
    private String sexEnum;

    @TableField(value = "ext_json",typeHandler = JacksonTypeHandler.class)
    private UserInfo extJson;

    private static final long serialVersionUID = 1L;
}