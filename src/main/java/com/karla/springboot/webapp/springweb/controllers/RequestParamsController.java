package com.karla.springboot.webapp.springweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.karla.springboot.webapp.springweb.models.ParamDto;
import com.karla.springboot.webapp.springweb.models.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")

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
        ParamMixDto params = new ParamMixDto();
        params.setCode(Integer.parseInt(request.getParameter("code")));
        params.setMessage(request.getParameter("message"));
        
        return params;
    }

}
