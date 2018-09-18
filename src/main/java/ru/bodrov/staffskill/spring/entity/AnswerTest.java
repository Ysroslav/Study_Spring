package ru.bodrov.staffskill.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
public class AnswerTest  {

    private QuestionTest questionTest;
    private String answerText;

    @Value(TestService.typeAnswer)
    private String answerType;
    private boolean right;



    @Autowired
    public AnswerTest(QuestionTest questionTest){
        this.questionTest = questionTest;
    }


    public void setQuestionTest(QuestionTest questionTest) {
        this.questionTest = questionTest;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public void setRight(boolean right) {
        this.right = right;
    }


    public QuestionTest getQuestionTest() {
        return questionTest;
    }

    public String getAnswerText() {
        return answerText;
    }

    public String getAnswerType() {
        return answerType;
    }

    public boolean getRight() {
        return right;
    }
}
