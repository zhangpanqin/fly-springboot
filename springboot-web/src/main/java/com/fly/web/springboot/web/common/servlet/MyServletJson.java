package com.fly.web.springboot.web.common.servlet;

import com.alibaba.fastjson.JSON;
import com.fly.web.springboot.web.common.util.RetUtil;
import com.fly.web.springboot.web.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * @author 张攀钦
 * @date 2019/8/21-12:45
 * 返回 json 数据 servlet
 */
@Slf4j
@WebServlet(name = "com.fly.web.springboot.web.common.servlet.MyServletJson", urlPatterns = "/servlet/json", description = "Servlet的说明")
@Component
public class MyServletJson extends HttpServlet {

    private static final long serialVersionUID = -8685285401859800066L;
    @Autowired
    private DemoService demoService;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.info(">>>>>>>>>>MyServletJson-service()<<<<<<<<<<<");
        demoService.log();
        HttpSession session = request.getSession();
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        PrintWriter writer = response.getWriter();
        RetUtil retUtil = RetUtil.success(session).message("返回 json servlet 测试");
        writer.print(JSON.toJSONString(retUtil));
        writer.close();
    }
}