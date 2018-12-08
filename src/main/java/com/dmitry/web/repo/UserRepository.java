package com.dmitry.web.repo;

import org.springframework.stereotype.Component;

@Component
public class UserRepository implements Repository {
    public User getUser() {
        return new User("Dima", "22");
    }
}
