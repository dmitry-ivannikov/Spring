package com.dmitry.webconfig;


import com.dmitry.web.config.MyWebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() { return null; }

    protected Class<?>[] getServletConfigClasses() { return new Class<?>[] { MyWebConfig.class }; }

    protected String[] getServletMappings() {
        return new String[] {"/spring/*"};
    }
}
