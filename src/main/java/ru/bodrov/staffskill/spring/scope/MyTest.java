package ru.bodrov.staffskill.spring.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.stereotype.Component;
import ru.bodrov.staffskill.spring.entity.TestService;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

//@Component
//@Scope(BeanDefinition.SCOPE_SINGLETON)
public class MyTest {

    public static final String NAME = "Test_S";

    private String testType;

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }


}
