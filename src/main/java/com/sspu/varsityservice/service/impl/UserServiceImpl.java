package com.sspu.varsityservice.service.impl;



import com.sspu.varsityservice.mapper.UserMapper;
import com.sspu.varsityservice.pojo.User;
import com.sspu.varsityservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User userLogin(String userCode,String userPassWord) {
        return userMapper.userLogin(userCode,userPassWord);
    }
}
