package com.karla.springboot.webapp.springweb.models;

public class ParamDto {
    private String message;
    private Integer code;
    
    public ParamDto(String message) {
        this.message = message;
    }

    public ParamDto(Integer code) {
        this.code = code;
    }

    public ParamDto() {
    }

    public ParamDto(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    
}
