package com.example.sbt.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class HelloController {

    @RequestMapping("/index")
    public String sayHello(){
        return"index";
    }
}
