package com.dmitry.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DbController {
    @Autowired
    JdbcOperations jdbcOperations;

    @GetMapping("createTable")
    @ResponseBody
    public String createTable(){
        jdbcOperations.execute("CREATE TABLE MyTable (id INT, fname VARCHAR(30), lname VARCHAR(30));");
//        jdbcOperations.execute("DROP TABLE MyTable");
        return "table was created";
    }
}
