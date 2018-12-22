package com.dmitry.web;

import com.dmitry.web.repo.User;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;

@Component
public class MyFlowBean {
    public void printHello(){
        System.out.println("Hello");
    }

    public boolean or() {
        return false;
    }

    public void printUser(User user){
        System.out.println(user.getName());
    }
    public void printI(int i) {
        System.out.println(i);
    }
}
