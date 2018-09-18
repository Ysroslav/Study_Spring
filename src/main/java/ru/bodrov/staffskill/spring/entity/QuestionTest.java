package ru.bodrov.staffskill.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
public class QuestionTest {

    private TestStaff testStaff;
    private String questionText;

    @Value(TestService.typeQuestion)
    private String questionType;


    @Autowired
    public QuestionTest(TestStaff testStaff){
        this.testStaff = testStaff;
    }


    public TestStaff getTestStaff() {
        return testStaff;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getQuestionType() {
        return questionType;
    }


    public void setTestStaff(TestStaff testStaff) {
        this.testStaff = testStaff;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }
}
