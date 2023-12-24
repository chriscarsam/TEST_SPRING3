package com.sam.course.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Lorena", "Navarra");
        User user2 = new User("Isabella", "Tabarez");
        User user3 = new User("Tania", "Santo Domingo");

        List<User> users = Arrays.asList(user, user2, user3);

        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;
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
