package com.sam.course.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
        model.addAttribute("title", "List of users!");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){
          return Arrays.asList(
            new User("Pepe", "Gonzalez"),
            new User("Lalo", "Perez", "lalo@email.com"),
            new User("Juanita", "Roe", "juanita@email.com"),
            new User("Charly", "Test"));
    }
}
