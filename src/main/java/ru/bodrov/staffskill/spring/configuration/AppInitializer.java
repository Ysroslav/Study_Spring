package ru.bodrov.staffskill.spring.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses(){
        return new Class[]{WebSecurityConfig.class, DataSourceConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class[]{WebMyConfig.class};
    }

    @Override
    protected String[] getServletMappings(){
       return new String[]{"/"};
    }

}