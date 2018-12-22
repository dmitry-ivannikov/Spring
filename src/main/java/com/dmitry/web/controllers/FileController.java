//package com.dmitry.web.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.File;
//import java.io.IOException;
//
//import static org.springframework.web.bind.annotation.RequestMethod.POST;
//
//@Controller
//public class FileController {
//    @GetMapping("file")
//    public String fileForm() {
//        return "file";
//    }
//
//    @RequestMapping(value = "/file", method=POST)
//    @ResponseBody
//    public String processRegistration(@RequestPart("file") MultipartFile file) throws IOException{
//        file.transferTo(new File(file.getOriginalFilename()));
//        return "hello";
//    }
//
//
//}
