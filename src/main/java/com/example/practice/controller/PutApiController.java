package com.example.practice.controller;

import dto.Car;
import dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {
    public int count =0;
    @PutMapping("/put")
    public PutRequestDto put(@RequestBody PutRequestDto RequestDto)
    {
        System.out.println((RequestDto));
        return RequestDto;
    }

    @PutMapping("/put2/{userId}")
    public PutRequestDto put2(@RequestBody PutRequestDto RequestDto, @PathVariable(name = "userId") Long id)
    {
        System.out.println((id));
        return RequestDto;
    }
}
/*
{
    name : "steve",
    age : 28,
    car_list : [
            {
                name : "BMW",
                car_number : "11가 1234"
            },
            {
                name : "Audi",
                car_number : "22가 3456"
            },
            ]
}
 */