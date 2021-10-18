package com.flywinter.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

/**
 * Created by IntelliJ IDEA
 * User:Zhang Xingkun
 * Date:2021/7/17 18:58
 * Description:
 */
public class CookieDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //服务器 告诉客户端来的时间，把这个时间封装成一个信件，下次来的时候带上，服务端就知道客户端上次访问的时间了
        //解决中文乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        //Cookie 服务端从客户端获取
        Cookie[] cookies = req.getCookies();//这里返回数组，说明cookie可能存在多个
        //判断Cookie是否存在
        if (cookies !=null) {
            //如果存在cookie
            writer.write("上一次访问的时间为:");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                //获取cookie的名字
                if (cookie.getName().equals("name")) {
                    //获取cookie中的值
                    //解码
                    writer.write(URLDecoder.decode(cookie.getValue(),"UTF-8"));
                }
            }
        }else {
            writer.write("这是第一次访问网站");
        }
        //编码
        Cookie cookie = new Cookie("name", URLEncoder.encode("中文数据","UTF-8"));
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
