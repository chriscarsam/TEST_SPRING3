package com.sam.course.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.course.springboot.webapp.springbootweb.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details(){
        User user = new User("Charly", "Test");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hello world Spring Boot");
        body.put("user", user);
        return body;
    }
}
