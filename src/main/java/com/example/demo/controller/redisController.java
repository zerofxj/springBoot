package com.example.demo.controller;

import com.example.demo.doman.User;
import com.example.demo.modul.ResponseModal;
import com.example.demo.service.IRedisService;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zero-j on 2017/7/18.
 */
@RestController
public class redisController {

    @Autowired
    private IUserService userService;

    @Autowired
    private IRedisService redisService;

    @RequestMapping("/users")
    public ResponseModal users(){
        List<User> users = userService.findAll();ResponseModal modal = new ResponseModal(200,true,"",users);
        return modal;
    }

    @RequestMapping("/redis/set")
    public ResponseModal redisSet(@RequestParam("value")String value){
        boolean isOk = redisService.set("name", value);
        return new ResponseModal(isOk ? 200 : 500, isOk, isOk ? "success" : "error" , null);
    }

    @RequestMapping("/redis/get")
    public ResponseModal redisGet(){
        String name = redisService.get("name");
        return new ResponseModal(200, true,"success",name);
    }
}
