package com.dmitry.web.impl;

import com.dmitry.web.interfaces.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

@Repository
public class ImplUserRepository implements Repo {
    @Autowired
    JdbcOperations jdbcOperations;
    public void createTable() {
        jdbcOperations.execute("CREATE TABLE MyTable (id INT, fname VARCHAR(30), lname VARCHAR(30));");
//        jdbcOperations.execute("DROP TABLE MyTable");
    }
}
