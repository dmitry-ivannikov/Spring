package com.dmitry.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reqParam/{one}")
public class TempController {
    @GetMapping("/reqParam/{one}/two/{three}")
    @ResponseBody
    public String getParams(@PathVariable("one") String one, @PathVariable int three) {
        return one + three;
//        http://localhost:8080/spring/reqParam/first/two/3
    }



//    @GetMapping("reqParam")
//    @ResponseBody
//    public String getParams(@RequestParam("paramPage") String first,
//                            @RequestParam(required = false, defaultValue = "nuPrivet") String second) {
////        http://localhost:8080/spring/reqParam?paramPage=bugaga (значение не проставленно, но приходит дефолтное значение)
//        return first + second;
//    }


}
