package com.sam.course.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

     @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hello world Spring Boot");
        model.addAttribute("name", "Charly");
        model.addAttribute("lastname", "Test");
        return "details";
    }
}
