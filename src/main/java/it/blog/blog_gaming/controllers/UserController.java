package it.blog.blog_gaming.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.blog.blog_gaming.services.UserService;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //rotta per la pagina di home
    @GetMapping("/")
    public String home() {
        return "home";
    }
    
}
