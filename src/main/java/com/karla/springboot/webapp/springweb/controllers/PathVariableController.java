package com.karla.springboot.webapp.springweb.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.karla.springboot.webapp.springweb.models.ParamDto;
import com.karla.springboot.webapp.springweb.models.ParamMixDto;
import com.karla.springboot.webapp.springweb.models.User;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/var")

public class PathVariableController {
    @Value("${config.username}")
    private String   username;
    @Value("${config.message}")
    private String   message;
    @Value("${config.listOfValues}")
    private String[] listOfValues;
    @Value("${config.code}")
    private Integer  code;

    @Value("#{'${config.listOfValues}'.toUpperCase().split(',')}")
    private List<String> valueList;

    @Value("#{'${config.listOfValues}'.toUpperCase()}")
    private String valueString;

    @Value("#{${config.valuesMap}}")
    private Map<String, Object> valuesMap;

    @Value("#{${config.valuesMap}.product}")
    private String product;

    @Value("#{${config.valuesMap}.price}")
    private String price;
    
    @Autowired
    private Environment environment;

    @GetMapping("/values")
    public Map<String, Object> values(){
        Map<String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("code", code);
        json.put("message", message);
        json.put("listOfValues", listOfValues);
        return json;
    }

    @GetMapping("/value")
    public Map<String, Object> value(@Value("${config.message}") String message){
        Map<String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("code", code);
        json.put("message", message);
        json.put("listOfValues", listOfValues);
        json.put("valueString", valueString);
        json.put("valueList", valueList);
        json.put("valueMap", valuesMap);
        json.put("message2", environment.getProperty("config.message"));
        json.put("code2", Integer.valueOf(environment.getProperty("config.code")));
        json.put("product", product);
        json.put("price", price);


        return json; 
    }
}
