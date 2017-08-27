package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zero-j on 2017/7/12.
 */
@RestController
@RequestMapping("/say")
public class helloController {


    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello Spring boot";
    }
}

