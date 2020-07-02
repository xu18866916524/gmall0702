package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @description:
 * @author: 107944
 * @date: 2020-07-02 16:17
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/get")
    public String index(){
        return "hello world";
    }

}
