package com.sam.course.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.course.springboot.webapp.springbootweb.models.User;
import com.sam.course.springboot.webapp.springbootweb.models.dto.UserDto;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {
        User user = new User("Isabella", "Tavarez");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hello world Spring Boot");
        
        return userDto;
    }
    

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        User user = new User("Charly", "Test");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hello world Spring Boot");
        body.put("user", user);
        return body;
    }
}
