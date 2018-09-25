package ru.bodrov.staffskill.spring.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.interceptor.Interceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"ru.bodrov.staffskill.spring.sqlservice", "ru.bodrov.staffskill.spring.controller", "ru.bodrov.staffskill.spring.bootstrap"})
//@ComponentScan(basePackages = "ru.bodrov.staffskill.spring.controller")
@EnableJpaRepositories("ru.bodrov.staffskill.spring.repository")
public class WebMyConfig implements WebMvcConfigurer {

   @Override
    public void configureViewResolvers(ViewResolverRegistry registry){
       registry.jsp().prefix("/WEB-INF/views/").suffix(".jsp");
   }

   @Override
    public void addViewControllers(ViewControllerRegistry registry){
       registry.addViewController("/login").setViewName("login");
   }
}
