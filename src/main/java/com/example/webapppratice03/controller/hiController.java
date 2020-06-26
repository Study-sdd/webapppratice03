package com.example.webapppratice03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class hiController {
    @GetMapping("/register")

    @RequestMapping("/register")
    public String register(HttpServletRequest request)
    {
        /*得到输入的数据。每向页面访问一次，
        就是向服务器发送一次请求，请求会带着输入的数据，
        这个请求是HttpServletRequest*/

        String username = request.getParameter("username");  //ALT+回车 username与html里面对应
        String password = request.getParameter("password");

        System.out.println(username);
        System.out.println(password);
        return "register";
    }
}
