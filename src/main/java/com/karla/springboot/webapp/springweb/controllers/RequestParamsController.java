package com.karla.springboot.webapp.springweb.controllers;

import java.util.HashMap;
import java.util.Map;

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

public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false,defaultValue = "Agrega un texto en la url", name = "message") String message){
      ParamDto param = new ParamDto();
      param.setMessage(message);
      return param;  
    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam  String text, @RequestParam Integer code) {
        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }
    
    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request){
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));    
        } catch (NumberFormatException e) {
            // TODO: handle exception
        }
        
        
        ParamMixDto params = new ParamMixDto();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));
        
        return params;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object>mixPathVar(@PathVariable String product, @PathVariable Long id){
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }


    
    @PostMapping("/create")
    public User create(@RequestBody User user){
        
        user.setName(user.getName().toUpperCase());
        return user;
    }
}
