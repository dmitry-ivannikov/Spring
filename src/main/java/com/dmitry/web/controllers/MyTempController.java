//package com.dmitry.web.controllers;
//
//import com.dmitry.web.repo.User;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.SessionAttribute;
//
//
//
//@Controller
//public class MyTempController {
//    @RequestMapping("redirFrom")
//    public String redirectFrom(){
////        return "redirect:/spring/redirTo";
//        return "forward:/spring/redirTo";
//        //http://localhost:8080/spring/redirFrom?name=dima
//    }
//
//    @RequestMapping("redirTo")
//    @ResponseBody
//    public String redirectTo
////            (@SessionAttribute User user)
//    (Model model)
//    {
//        User user = (User) model.asMap().get("user");
//        return "HelloFromTo" + user.getName();
//    }
//
//}
