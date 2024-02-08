package com.karla.springboot.webapp.springweb.models.dto;
import com.karla.springboot.webapp.springweb.models.User;

public class UserDto {

    private String title;
    private User user;
    
    public UserDto() {
    }

    public UserDto(String title, User user) {
        this.title = title;
        this.user = user;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
