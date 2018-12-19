package com.dmitry.webconfig;


import com.dmitry.web.config.MyWebConfig;
import com.dmitry.web.config.MyWebConfigForFlow;
import com.dmitry.web.config.WebFlowConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() { return null; }

    protected Class<?>[] getServletConfigClasses() { return new Class<?>[] { MyWebConfigForFlow.class, WebFlowConfig.class}; }

    protected String[] getServletMappings() {
        return new String[] {"/spring/*"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(new MultipartConfigElement("/tmp/app/uploads"));
    }
}
