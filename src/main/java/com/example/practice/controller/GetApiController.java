package com.example.practice.controller;

import dto.UserRequest;
import org.apache.catalina.User;
import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")
    public String getHello(){
        return "get Hello";
    }

    @RequestMapping(path = "/hi",method = RequestMethod.GET)
    public String hi() {
        return "hi";
    }
    //http://localhost:9090/api/get/path-variable/{name}

    @RequestMapping("/path-variable/{name}")
    public String PathVariable(@PathVariable(name = "name") String pathName)
    {
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }
    //http://localhost:9090/api/get/query-param?user=steve&email=poujis@google.com&age=28
    @RequestMapping(path = "/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder  sb =new StringBuilder();
        queryParam.entrySet().forEach(entry->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });
        return sb.toString();
    }

    @GetMapping("/query-param02")
    public String queryParam02(@RequestParam String name,
                               @RequestParam String email,
                               @RequestParam int age){

        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name+ " "+ email + " "+age;
    }

    @GetMapping("/query-param03")
    public String queryParam03(UserRequest userRequest){

        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
