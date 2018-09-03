package ru.bodrov.staffskill.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;
import ru.bodrov.staffskill.spring.annotation.InjectUUID;

import java.lang.reflect.Field;
import java.lang.reflect.ReflectPermission;
import java.util.UUID;

public class UniqueBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
       final Field[] fields = bean.getClass().getDeclaredFields();
       for(Field field: fields){
           if(field.isAnnotationPresent(InjectUUID.class)){
               field.setAccessible(true);
               ReflectionUtils.setField(field, bean, UUID.randomUUID().toString());
           }
       }
       return bean;
    }
}
