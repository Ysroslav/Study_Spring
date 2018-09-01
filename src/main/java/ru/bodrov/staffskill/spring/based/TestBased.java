package ru.bodrov.staffskill.spring.based;

import org.springframework.beans.factory.annotation.Value;
import ru.bodrov.staffskill.spring.entity.TestService;

public class TestBased {

    public static final String NAME = "New_Test";
    private String testType;

    public TestBased(String testType){ this.testType = testType;}

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

}
