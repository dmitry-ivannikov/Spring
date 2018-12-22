package com.dmitry.web;

import org.springframework.stereotype.Component;

@Component
public class MyFlowBean {
    public void printHello(){
        System.out.println("Hello");
    }

    public boolean or() {
        return false;
    }
}
