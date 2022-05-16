package com.example.practice.controller;

import dto.ResponseUserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//html 리턴
@Controller
public class PageController {
    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    //ResponseEntity
    @ResponseBody
    @GetMapping("/user")
    public ResponseUserDto user(){
        var user = new ResponseUserDto();
        user.setName("steve");
        user.setAddress("패스트 캠퍼스");
        return user;
    }
}
