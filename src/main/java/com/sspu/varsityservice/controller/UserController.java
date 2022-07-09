package com.sspu.varsityservice.controller;


import com.sspu.varsityservice.pojo.User;
import com.sspu.varsityservice.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;


    @RequestMapping("/searchUser")
    public User searcherUser(@RequestParam("id") int id){
        return userService.searchUser(id);
    }
}
