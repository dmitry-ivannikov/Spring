package com.dmitry.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = {"/home"})
public class HelloWorldController {
//    @RequestMapping(value = {"first", "third"}, method = RequestMethod.GET, params = "!myParam")
    @GetMapping(value = "first")
    @ResponseBody
    public String home1() {
      //  return "/WEB-INF/views/home.jsp";
        return "home1";
    }

    //@PostMapping
    //или
    @RequestMapping(value = "second", method = RequestMethod.POST)
    @ResponseBody
    public String home2() {
        return "home2";
    }

}
