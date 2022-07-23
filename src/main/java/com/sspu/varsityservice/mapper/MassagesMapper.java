package com.sspu.varsityservice.mapper;


import com.sspu.varsityservice.pojo.Massages;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MassagesMapper {

    public List<Massages> getAllMassages(@Param("index") int index);
}
