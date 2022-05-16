package com.example.practice.controller;

import dto.PostRequestDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/*
Json
    string  : value
    number  : value
    boolean : value {}
    object  : value
    array   : value []

    {
        "phone_number " : "010-1234-5678",
        "age" : 10,
        "isAgree" = false,
        "account" : {
                    "email" : "abcd@abcd.com",
                    "password" : "1234"
                    } -->object
    }
    //user 조회 하는 경우
    {
        "user_list" : [
            {
                "account" : "abcd",
                "password" : "1234",
            },
            {
                "account" : "aaaa",
                "password" : "11",
            },
            {
                "account" : "bbbb",
                "password" : "22",
            },
    }
 */

@RestController
@RequestMapping("/api")
public class PostApiController {
    @RequestMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData){

        requestData.forEach((key, value) -> {
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });

    }

    @RequestMapping("/post2")
    public void post2(@RequestBody PostRequestDto requestData){

        System.out.println(requestData);

    }

}
