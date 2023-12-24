package com.sam.course.springboot.webapp.springbootweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.sam.course.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {

     @GetMapping("/details")
    public String details(Model model){
        User user = new User("Charly", "Test");
        user.setEmail("charly@email.com");
        model.addAttribute("title", "Hello world Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        List<User> users = new ArrayList<>();

        model.addAttribute("users", users);
        model.addAttribute("title", "List of users");
        return "list";
    }
}
