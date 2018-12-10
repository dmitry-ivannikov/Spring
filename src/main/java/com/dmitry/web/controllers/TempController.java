package com.dmitry.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TempController {
    @GetMapping("reqParam")
    @ResponseBody
    public String getParams(@RequestParam("paramPage") String first,
                            @RequestParam(required = false, defaultValue = "nuPrivet") String second) {
//        http://localhost:8080/spring/reqParam?paramPage=bugaga (значение не проставленно, но приходит дефолтное значение)
        return first + second;
//        http://localhost:8080/spring/reqParam?paramPage=bugaga
//        http://localhost:8080/spring/reqParam?paramPage=bugaga&second=2

    }
}
