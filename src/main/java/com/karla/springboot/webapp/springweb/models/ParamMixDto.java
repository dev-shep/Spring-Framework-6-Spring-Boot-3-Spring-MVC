package com.karla.springboot.webapp.springweb.models;

public class ParamMixDto {
    private String message;
    private Integer code;
    
    public ParamMixDto(String message) {
        this.message = message;
    }

    public ParamMixDto(Integer code) {
        this.code = code;
    }

    public ParamMixDto() {
    }

    public ParamMixDto(String message, Integer code) {
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
