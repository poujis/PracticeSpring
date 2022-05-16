package com.example.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 CLASS는 REST API를 처리하는 Controller
@RequestMapping("/api") // RequestMapping 은 URL을 지칭해주는 Annotation
public class ApiController {
    public static int cnt  =0;
    @GetMapping("/hello")
    public String hello() // http://localhost:9090/api/hello
    {
        return "hello spring boot";
    }
    @GetMapping("/count")
    public int count()
    {
        return cnt++;
    }

}
