package com.fly.web.springboot.web.common.interceptor;

import org.springframework.stereotype.Service;

/**
 * @author 张攀钦
 * @date 2020-06-27-20:50
 */
@Service
public class IUserInfoService {
    public UserInfoDTO getUserInfoByUserName(String userName) {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUserName(userName);
        return userInfoDTO;
    }
}
