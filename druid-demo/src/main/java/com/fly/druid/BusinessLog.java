package com.fly.druid;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019-12-10-17:27
 * @description ${description}
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "business_log")
public class BusinessLog implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    @TableField(value = "user_name")
    private String userName;

    @TableField(value = "user_id")
    private String userId;

    @TableField(value = "ua")
    private String ua;

    @TableField(value = "operation")
    private String operation;

    @TableField(value = "request_param")
    private String requestParam;

    @TableField(value = "ip")
    private String ip;

    @TableField(value = "create_time")
    private String createTime;

    @TableField(value = "desciption")
    private String desciption;

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        BusinessLog businessLog = new BusinessLog();
        String str = "张攀钦wsdfasdfasdgsdfasdfasdfsdfasdfad";
        businessLog.setUserName(str);
        businessLog.setUserId(str);
        businessLog.setUa(str);
        businessLog.setOperation(str);
        businessLog.setRequestParam(str);
        businessLog.setId(str);
        businessLog.setCreateTime(str);
        businessLog.setDesciption(str);
        System.out.println(JSON.toJSONString(businessLog));
    }
}