package com.dmitry.web.controllers;

import com.dmitry.web.repo.User;
import com.dmitry.web.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping(value = {"/home"})
public class HelloWorldController {

    @Autowired
    UserRepository userRepository;
    @GetMapping(value = "home")

//    public String home(Model model) {
//        model.addAttribute("Yo");
//        model.addAttribute("name", "Dima");
//        model.addAttribute(userRepository.getUser());
//        return "home";
//    }

    public User home(Model model) {
        return userRepository.getUser();
    }

}
