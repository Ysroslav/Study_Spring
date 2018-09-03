package ru.bodrov.staffskill.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import ru.bodrov.staffskill.spring.service.TestServiceIml;
import ru.bodrov.staffskill.spring.service.TestServiceMind;
import ru.bodrov.staffskill.spring.service.TestStaffService;

@Component
public class TestStaffBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        final String[] names = beanFactory.getBeanDefinitionNames();
        for(final String name: names){
            final BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            final String className = beanDefinition.getBeanClassName();
            try{
                final Class originalClass = Class.forName(className);
                if(TestServiceIml.class.equals(originalClass)){
                    beanDefinition.setBeanClassName(TestStaffService.class.getName());
                }
            } catch(ClassNotFoundException e){
                throw new RuntimeException();
            }
        }
        System.out.println();
    }

}
