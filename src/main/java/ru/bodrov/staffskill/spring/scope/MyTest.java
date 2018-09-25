package ru.bodrov.staffskill.spring.scope;

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
