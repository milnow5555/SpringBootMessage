package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${message.show}")
    private String helloWorld;
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}