package com.dmitry.web.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionCatchClass {
    @ExceptionHandler(MyExceptionController.MyNewExeption.class)
    @ResponseBody
    public String catchException(){
        return "some error";
    }
}
