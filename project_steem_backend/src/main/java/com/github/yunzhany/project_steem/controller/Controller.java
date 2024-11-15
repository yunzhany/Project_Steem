package com.github.yunzhany.project_steem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("man")
    public String hello(){
        System.out.println("OK");
        return "what can I say";
    }

    @RequestMapping("simpleparam")
    public String simpleparam (String name, int age){
        System.out.println("Name: " + name + ", Age: " + age);
        return "OK";
    }



}
