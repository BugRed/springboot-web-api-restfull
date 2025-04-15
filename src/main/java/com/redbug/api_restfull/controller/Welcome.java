package com.redbug.api_restfull.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping
    public String welcome(){
        return "welcome";
    }
}
