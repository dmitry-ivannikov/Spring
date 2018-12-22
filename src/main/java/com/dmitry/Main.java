//package com.dmitry;
//
//import com.dmitry.web.config.MyDbConfig;
//import com.dmitry.web.impl.ImplUserRepository;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class Main {
//    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(MyDbConfig.class);
//        ImplUserRepository bean = context.getBean(ImplUserRepository.class);
//        bean.createTable();
//    }
//}
