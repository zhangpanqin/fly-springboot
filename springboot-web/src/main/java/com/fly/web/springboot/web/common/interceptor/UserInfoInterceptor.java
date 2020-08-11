package com.fly.web.springboot.web.common.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 张攀钦
 * @date 2018/12/21-22:59
 */
@Slf4j
public class UserInfoInterceptor implements HandlerInterceptor {
    private static final ThreadLocal<UserInfoDTO> THREAD_LOCAL = new ThreadLocal();
    private static final String USER_NAME = "userName";
    @Autowired
    private IUserInfoService userInfoService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            String userName = request.getHeader(USER_NAME);
            UserInfoDTO userInfoByUserName = userInfoService.getUserInfoByUserName(userName);
            THREAD_LOCAL.set(userInfoByUserName);
            return true;
        }
        return false;
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        THREAD_LOCAL.remove();
    }
    public static UserInfoDTO getCurrentRequestUserInfoDTO() {
        return THREAD_LOCAL.get();
    }
}