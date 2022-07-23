package com.sspu.varsityservice.service;


import com.sspu.varsityservice.pojo.User;

public interface UserService {

    public User userLogin(String userCode,String userPassWord);
}
