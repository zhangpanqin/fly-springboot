package com.fly.aop.common.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 张攀钦
 * @date 2018/12/21-22:59
 * 测试拦截器1
 * preHandle 返回 true   afterCompletion一定执行
 * 回调链中有一个 preHandle 返回 false ,之后 preHandle 不执行,postHandle 不执行
 */
@Slf4j
public class MyInterceptor1 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("MyInterceptor1-preHandle>>>在请求处理之前进行调用（Controller方法调用之前）");
        log.info(request.getRequestURI());
        // 只有返回true才会继续向下执行，返回false取消当前请求
        return true;
    }

    /**
     * handler 当请求为静态资源的时候为 ResourceHttpRequestHandler,当请求为接口的时候为 HandlerMethod
     */

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("MyInterceptor1-postHandle>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("MyInterceptor1-afterCompletion>>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
    }

}