package com.fly.swagger2.moudle.enitity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019-10-10-11:44
 * @description 用户实体
 */
@Data
@ApiModel
public class UserDO implements Serializable {

    private static final long serialVersionUID = 1638518814368132961L;

    @ApiModelProperty(value = "用户主键id")
    private Integer id;

    @ApiModelProperty(value = "用户名")
    private String username;
}
