package ru.bodrov.staffskill.spring.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.bodrov.staffskill.spring.entity.TestService;

//@Component
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class OtherTest {

    public static final String NAME = "Test_P";

    @Value(TestService.typeTest)
    private String testType;

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

}
