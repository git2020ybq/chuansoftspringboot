package com.chuansoft.springboot.chuansoftspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {

    @GetMapping("/hello")
    //@ResponseBody
    public String sayHello(){
        return "hello 热部署";
    }
}
