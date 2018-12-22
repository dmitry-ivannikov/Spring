//package com.dmitry.web.controllers;
//
//import com.dmitry.web.repo.User;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.CookieValue;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.SessionAttribute;
//
//import java.io.IOException;
//import java.io.Writer;
//
//@Controller
//public class TempController {
//    @GetMapping("/temp")
////    public void getParams(Model model,
////                          ServletRequest request,
////                          ServletResponse response
////                          ) throws IOException {
////        response.getWriter().write("Hello from servlet");
////    }
//
//    public void getParams(Model model,
//                          Writer writer,
//                          @CookieValue("JSESSIONID") String cookies,
//                          @RequestHeader("Host") String header,
//                          @SessionAttribute User user
//    ) throws IOException {
//        writer.write(cookies + " " + header);
//    }
//
//}
