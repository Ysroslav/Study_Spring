package ru.bodrov.staffskill.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class ApplicationBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException{
        System.out.println("BeanFactoryPostProcessor");
        System.out.println();
        final String[] beanDefinationNames = beanFactory.getBeanDefinitionNames();
        for(final String name: beanDefinationNames){
            final BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            final String className = beanDefinition.getBeanClassName();
            System.out.println(name + " : " + className);
        }
        System.out.println();
        System.out.println("end");
    }

}
