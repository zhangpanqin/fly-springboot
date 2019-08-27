package com.fly.web.springboot.web.common.servlet;

import com.fly.web.springboot.web.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 张攀钦
 * @date 2018/12/21-18:51
 * 将 servlet 通过（@Component 和 @WebServlet） 注册为 ioc 容器的bean，并 使用@WebServlet 说明 servlet 的作用
 */
@Slf4j
@WebServlet(name = "com.fly.web.springboot.web.common.servlet.MyHtmlServlet", urlPatterns = "/servlet/html")
@Component
public class MyHtmlServlet extends HttpServlet {

    private static final long serialVersionUID = -8685285401859800066L;
    @Autowired
    private DemoService demoService;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info(">>>>>>>>>>MyHtmlServlet-service()<<<<<<<<<<<");
        demoService.log();
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World-MyHtmlServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>大家好，我的名字叫 MyHtmlServlet</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}