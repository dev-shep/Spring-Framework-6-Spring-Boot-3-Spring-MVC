package com.karla.springboot.webapp.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class UserController {
    
    @GetMapping("/details")
    public String details(){
        return "details";
    }
    
}
