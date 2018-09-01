package ru.bodrov.staffskill.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.print.DocFlavor;
import java.util.Date;

@Component(TestStaff.NAME)
public class TestStaff {

    public static final String NAME = "New_Test";

    @Value(TestService.typeTest)
    private String testType;

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }
}
