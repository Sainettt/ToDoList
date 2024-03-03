package com.example.ToDoList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/main")
    public class ApiController {

        @GetMapping("/hello")
        public String hello() {
            return "Heil Hitler, lubie zabijac chochlikow";
        }
    }

