package com.dmitry.web.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MyExceptionController {
    @GetMapping("myException")
    public void getException() {
        throw new MyNewExeption();
    }
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "User Not Found")
    class MyNewExeption extends RuntimeException {
    }

}
