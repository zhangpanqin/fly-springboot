package com.fly.sutdy.domain;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author 张攀钦
 * @date 2019-08-23-12:56
 * @description 跨域请求
 */
@RestController
public class DomainController {

    @GetMapping(value = "/domain/ajax/jsonp/no-cookie")
    public String domainAjaxJsonpNoCookie(HttpServletRequest request){
        HashMap<Object, Object> ret = new HashMap<>(16);
        ret.put("key1","ajax-jsonp-no-cookie");
        ret.put("key2", Math.random());
        String callback = request.getParameter("callback");
        String retString= JSON.toJSONString(ret);
        retString=callback+"("+retString+")";
        return retString;
    }
//    @CrossOrigin(value = "*")
    @GetMapping(value = "/domain/ajax/cors/no-cookie")
    public Map domainAjaxCorsNoCookie(HttpServletRequest request){
        HashMap<Object, Object> ret = new HashMap<>(16);
        ret.put("key1","ajax-cors-no-cookie");
        ret.put("key2", Math.random());
        return ret;
    }

    /**
     * 查看浏览器有多少个 cookie
     */
//    @CrossOrigin(value = "http://192.168.203.50:8080",allowCredentials="true")
    @GetMapping(value = "/domain/cors/cookie")
    public Map domainCorsCookie(HttpServletRequest request, HttpServletResponse response){
        Cookie[] cookies = request.getCookies();
        HashMap<Object, Object> ret = new HashMap<>(16);
        if(cookies!=null){
            for (Cookie cookie1 : cookies) {
                if (Objects.equals("corsCookie",cookie1.getName())) {
                    ret.put(cookie1.getName(),cookie1.getValue());
                }
            }
        }
        return ret;
    }

//    @CrossOrigin(value = "http://192.168.203.50:8080",allowCredentials="true")
    @GetMapping(value = "/domain/ajax/cors/cookie")
    public Map domainAjaxCorsCookie(HttpServletRequest request, HttpServletResponse response){
        WebApplicationContext webApplicationContext = RequestContextUtils.findWebApplicationContext(request);
        System.out.println(webApplicationContext);
        HashMap<Object, Object> ret = new HashMap<>(16);
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            System.out.println(cookies.length);
            for (Cookie cookie1 : cookies) {
                    ret.put(cookie1.getName(),cookie1.getValue());
            }
        }
        Cookie retCookie=new Cookie("serverCookie",String.valueOf(Math.random()));
        retCookie.setMaxAge(10000000);
        retCookie.setHttpOnly(true);
        // 跨域设置 cookie 必须设置 path
//        retCookie.setPath("/");
        response.addCookie(retCookie);

        return ret;
    }
    @GetMapping(value = "/domain/headers")
    public Map domainHeaders(HttpServletResponse response,HttpServletRequest request){
        String au1 = request.getHeader("au1");
        String au2 = request.getHeader("au2");

        response.setHeader("au3","au3");
        response.setHeader("au4","au4");
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("au1",au1);
        objectObjectHashMap.put("au2",au2);
        objectObjectHashMap.put("au3","au3");
        objectObjectHashMap.put("au4","au4");
        return objectObjectHashMap;
    }
}
