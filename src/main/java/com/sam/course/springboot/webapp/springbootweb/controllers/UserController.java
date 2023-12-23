package com.sam.course.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sam.course.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {

     @GetMapping("/details")
    public String details(Model model){
        User user = new User("Charly", "Test");
        model.addAttribute("title", "Hello world Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }
}
