package com.example.practice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {
    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable(name = "userId") String UserId, @RequestParam String account){
        System.out.println(UserId);
        System.out.println(account);
    }

}
