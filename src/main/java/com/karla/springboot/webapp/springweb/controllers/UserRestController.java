package com.karla.springboot.webapp.springweb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.karla.springboot.webapp.springweb.models.User;

import com.karla.springboot.webapp.springweb.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping(path="/details")
    public UserDto details() {

        User user = new User("Andres", "Guzman");

        UserDto userDto = new UserDto();

        userDto.setUser(user);
        userDto.setTitle("Hola mundo");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Andres", "Guzman");
        User user1 = new User("Pepe", "Andrade");
        User user2 = new User("Jhon", "Doe");

        List<User> users = Arrays.asList(user,user1,user2);
    /*    List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        */
        return users;
    }


    @GetMapping(path="/details-map")
    public Map<String, Object> detailsMap() {

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        body.put("name", "Karla");

        return body;
    }
}
