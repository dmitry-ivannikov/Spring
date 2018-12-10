package com.dmitry.web.controllers;

import com.dmitry.web.repo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormController {
    @GetMapping("/myForm")
    public String getParams() {
        return "form";

    }

//    @PostMapping("/myForm")
//    @ResponseBody
//    public String getFormData(@RequestParam String name, @RequestParam int age){
//        return  name + " " + age;
//    }

    @PostMapping("/form")
    @ResponseBody
    public String getFormData(User user){
        return  user.getName() + " " + user.getAge();
    }
}
