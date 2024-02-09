package com.karla.springboot.webapp.springweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.karla.springboot.webapp.springweb.models.ParamDto;

@RestController
@RequestMapping("/api/params")

public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false,defaultValue = "Agrega un texto en la url", name = "message") String message){
      ParamDto param = new ParamDto();
      param.setMessage(message);
      return param;  
    }
}
