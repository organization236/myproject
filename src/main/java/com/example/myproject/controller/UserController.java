package com.example.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "hellos";
    }

    @GetMapping(value = "/login")
    public String login(){
        return "登录成功";
    }

}
