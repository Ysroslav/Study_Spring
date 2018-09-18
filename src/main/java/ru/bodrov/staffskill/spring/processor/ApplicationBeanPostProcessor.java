package ru.bodrov.staffskill.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class ApplicationBeanPostProcessor implements BeanPostProcessor {


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
        System.out.println("Before Initialization" + beanName);
        return bean;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
        System.out.println("After Initialization" + beanName);
        System.out.println("end");
        return bean;
    }
}
