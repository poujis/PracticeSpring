package com.example.practice.controller;

import dto.ResponseUserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ResponseApiController {
    //TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    //JSON
    // req -> object mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public ResponseUserDto json(@RequestBody ResponseUserDto user){
        return user;
    }
    //ResponseEntity
    @PutMapping("/responseput")
    public ResponseEntity<ResponseUserDto> put(@RequestBody ResponseUserDto user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
/*
{
    "name" : "steve",
    "age" : 10,
    "phoneNumber" : "010-1234-5678",
    "address" : "smcore"
}
 */