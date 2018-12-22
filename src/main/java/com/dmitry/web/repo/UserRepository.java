package com.dmitry.web.repo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class UserRepository implements Repository, Serializable {
    public User getUser() {
        return new User("Dima", 22);
    }
}
