package ru.bodrov.staffskill.spring.based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import ru.bodrov.staffskill.spring.entity.QuestionTest;
import ru.bodrov.staffskill.spring.entity.TestService;

public class AnswerBased {

    private QuestionBased questionBased;
    private String answerText;
    private String answerType;
    private boolean right;


    public AnswerBased(QuestionBased questionBased, String answerType){
        this.questionBased = questionBased;
        this.answerType = answerType;
    }


    public void setQuestionBased(QuestionBased questionBased) {
        this.questionBased = questionBased;
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


    public QuestionBased getQuestionBased() {
        return questionBased;
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
