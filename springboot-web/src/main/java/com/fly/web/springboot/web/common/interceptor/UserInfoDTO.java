package com.fly.web.springboot.web.common.interceptor;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2020-06-27-20:51
 */
@Data
public class UserInfoDTO implements Serializable {
    private static final long serialVersionUID = -7111410570728453398L;

    private String userName;
}
