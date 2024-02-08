package com.karla.springboot.webapp.springweb.controllers;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.karla.springboot.webapp.springweb.models.User;

@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model){  

        User user = new User("Andres", "Guzman");
        user.setEmail("andres@correo.com"); 
        model.addAttribute("title","Hola Mundo Spring Boot");
        model.addAttribute("name","Karla");
        model.addAttribute("user",user);
        return "details";
    }


    @GetMapping("/list")
    public String list(ModelMap model){  

        List<User> users = Arrays.asList(new User("Karla", "Limon"),
        new User("Karen", "Gonzalez","x@hotmail.com"),
        new User("Roe", "Lopez","prueba@gmail.com"),
        new User("Row", "Perez") );

        model.addAttribute("users",users);
        model.addAttribute("title","Listado de usuarios!");

        return "list";
    }
    
}
