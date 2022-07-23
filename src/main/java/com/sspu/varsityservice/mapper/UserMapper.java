package com.sspu.varsityservice.mapper;


import com.sspu.varsityservice.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    public User userLogin(@Param("userCode") String userCode, @Param("userPassWord") String userPassWord);
}
