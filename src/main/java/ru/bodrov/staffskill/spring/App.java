package ru.bodrov.staffskill.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.bodrov.staffskill.spring.configuration.ApplicationConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
    }
}
