package com.sspu.varsityservice.mapper;


import com.sspu.varsityservice.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public User searchUser(int id);
}
