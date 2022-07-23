package com.sspu.varsityservice.controller;


import com.sspu.varsityservice.pojo.Massages;
import com.sspu.varsityservice.service.MassagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MassagesController {


    @Autowired
    MassagesService massagesService;

    @RequestMapping("/getAllMassages")
    public List getAllMassages(@RequestParam("index") int index){
        List<Massages> allMassages = massagesService.getAllMassages(index);
        return allMassages;
    }
}
