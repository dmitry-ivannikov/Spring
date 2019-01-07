package com.dmitry.web.controllers;

import com.dmitry.entities.MyTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.ResultSet;
import java.sql.SQLException;

@Controller
public class DbController {
    @Autowired
    JdbcOperations jdbcOperations;

    @GetMapping("createTable")
    @ResponseBody
    public void createTable(){
        jdbcOperations.execute("CREATE TABLE IF NOT EXISTS MyTable (id int NOT NULL AUTO_INCREMENT PRIMARY KEY, fname VARCHAR(30), lname VARCHAR(30));");
        jdbcOperations.update("INSERT into MyTable (fname) VALUES ('first book')");
        jdbcOperations.update("update MyTable set fname = 'second book' where id = ?", 1);

        //        jdbcOperations.execute("DROP TABLE MyTable");
//        MyTable myTable = jdbcOperations.queryForObject("select * from MyTable where id = ?",  new MyRowMapper(), 1);

        MyTable myTable = jdbcOperations.queryForObject("select * from MyTable where id = ?",
                (rs,i) -> {return
                        new MyTable(
                                rs.getInt("id"),
                                rs.getString("fname")
                                    );
                            }, 1);

        System.out.println(myTable.getId());
        System.out.println(myTable.getName());
    }
//    static class MyRowMapper implements RowMapper<MyTable>{
//
//        public MyTable mapRow(ResultSet resultSet, int i) throws SQLException {
//            return new MyTable(resultSet.getInt("id"), resultSet.getString("fname"));
//        }
//    }
}
