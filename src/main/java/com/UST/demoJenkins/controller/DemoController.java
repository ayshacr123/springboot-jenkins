package com.UST.demoJenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome Aysha";
    }
    @GetMapping("/aysha")
    public String welcomeAadil(){
        return "welcome Aysha C R";
    }
}
