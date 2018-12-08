package com.dmitry.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home() {
      //  return "/WEB-INF/views/home.jsp";
        return "home";
    }
}
