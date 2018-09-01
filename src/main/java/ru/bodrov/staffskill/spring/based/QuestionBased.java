package ru.bodrov.staffskill.spring.based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import ru.bodrov.staffskill.spring.entity.TestService;
import ru.bodrov.staffskill.spring.entity.TestStaff;

public class QuestionBased {

    private TestBased testBased;
    private String questionText;
    private String questionType;


    public QuestionBased(TestBased testBased, String questionType){
        this.testBased = testBased;
        this.questionType = questionType;
    }


    public TestBased getTestBased() {
        return testBased;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getQuestionType() {
        return questionType;
    }


    public void setTestBased(TestBased testBased) {
        this.testBased = testBased;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

}
