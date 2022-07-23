package com.sspu.varsityservice.service.impl;


import com.sspu.varsityservice.mapper.MassagesMapper;
import com.sspu.varsityservice.pojo.Massages;
import com.sspu.varsityservice.service.MassagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MassagesServiceImpl implements MassagesService{

    @Autowired
    MassagesMapper massagesMapper;

    @Override
    public List<Massages> getAllMassages(int index) {
        return massagesMapper.getAllMassages(index);
    }
}
