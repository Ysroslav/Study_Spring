package ru.bodrov.staffskill.spring.scope;

import junit.framework.AssertionFailedError;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import static org.junit.Assert.assertEquals;

@ComponentScan("ru.bodrov.staffskill.spring.scope")
public class AppScopeTest {

    @Test
    public void testScopeSingleton(){
        final ApplicationContext context = new AnnotationConfigApplicationContext(AppScopeTest.class);
        assertEquals(context.getBean(MyTest.class), context.getBean(MyTest.class));
    }

    @Test(expected = AssertionFailedError.class)
    public void testPrototype(){
        final ApplicationContext context = new AnnotationConfigApplicationContext(AppScopeTest.class);
        assertEquals(context.getBean(OtherTest.class), context.getBean(OtherTest.class));
    }
}
