package net.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestFilterServlet", urlPatterns = "/testFilter")
public class TestFilterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response中有中文要处理一下
        response.setContentType("text/html;charset=utf-8");

        response.getWriter().write("testFilter已经被访问了，虽然在web.xml设置了/*过滤，但通过filterChain再次放行");

    }
}
