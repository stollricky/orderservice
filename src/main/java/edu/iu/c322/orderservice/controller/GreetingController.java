package edu.iu.c322.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // Get https:localhost:8083
    @GetMapping("/")
    public String greetings(){
        return "Greetings!";
    }
}
