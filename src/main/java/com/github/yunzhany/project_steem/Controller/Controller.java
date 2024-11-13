package com.github.yunzhany.project_steem.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("hello")
    public String hello(){
        System.out.println("Hello World");
        return "hello";
    }

    @RequestMapping("simpleparam")
    public void simpleparam (@RequestParam String name, int age){
        System.out.println("Hello World");
    }

}
