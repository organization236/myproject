package com.example.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {

    @GetMapping(value = "/login")
    public String login(){
        return "登录成功1";
    }
}
