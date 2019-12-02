package com.fly.web.springboot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 张攀钦
 * @date 2019-12-01-16:50
 * @description
 */
@RestController
public class PathControllerDemo {

    @GetMapping(value = "/servlet_path/demo2")
    public Map getPath(HttpServletRequest request) {
        final StringBuffer requestURL = request.getRequestURL();
        final HashMap ret = new HashMap<>(16);
        ret.put("PathInfo",request.getPathInfo());
        ret.put("contextPath",request.getContextPath());
        ret.put("servletPath",request.getServletPath());
        ret.put("requestURL",requestURL.toString());
        final String queryString = request.getQueryString();
        ret.put("queryString",queryString);
        ret.put("requestUri",request.getRequestURI());
        return ret;
    }
}
