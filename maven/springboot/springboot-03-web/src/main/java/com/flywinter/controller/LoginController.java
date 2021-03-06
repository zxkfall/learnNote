package com.flywinter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA
 * User:Zhang Xingkun
 * Date:2021/8/1 12:25
 * Description:
 */
@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session){

        //具体的业务
        if (!StringUtils.isEmpty(username) &&
                "123456".equals(password)) {
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else {
            //告诉用户登录失败了
            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }
    }
}
