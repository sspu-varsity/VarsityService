package com.sspu.varsityservice.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CommunityController {

    @RequestMapping("/getMassages")
    public Map getMassages(){
        HashMap<String, String> massage = new HashMap<>();
        massage.put("massage","helloWord");
        return massage;
    }

}
