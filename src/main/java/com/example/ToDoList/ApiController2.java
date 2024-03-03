package com.example.ToDoList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main2")
public class ApiController2 {
    @GetMapping("/hello2")
    public String hello2(){
        return "Delaem proekt"; 
    }

}
