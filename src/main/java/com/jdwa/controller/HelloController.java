package com.jdwa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/hello")
public class HelloController {

    //查出用户数据，再界面展示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","你好！");
        return "success";
    }
}
