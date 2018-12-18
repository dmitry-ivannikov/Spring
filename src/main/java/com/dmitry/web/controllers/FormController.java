package com.dmitry.web.controllers;

import com.dmitry.web.repo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;


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
//    @ResponseBody
    public String getFormData
//            (User user, HttpSession session)
    (User user, RedirectAttributes model)
    {
//        return  user.getName() + " " + user.getAge();
//        session.setAttribute("user", user);
        model.addFlashAttribute("user", user);
        return "redirect:/spring/redirTo";
//        return "forward:/spring/redirTo";
    }
}
