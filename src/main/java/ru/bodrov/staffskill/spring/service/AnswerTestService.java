package ru.bodrov.staffskill.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.bodrov.staffskill.spring.annotation.InjectUUID;
import ru.bodrov.staffskill.spring.entity.TestService;

import java.util.logging.Logger;

@Component(AnswerService.NAME)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class AnswerTestService implements AnswerService {

    private static final Logger LOGGER = Logger.getAnonymousLogger();

    @InjectUUID
    private String id;

    @Autowired
    private QuestionService questionTest;

    private String answerText;

    @Value(TestService.typeAnswer)
    private String answerType;

    private boolean right;

    public void setId(String id){this.id = id;}
    public void setQuestionTest(QuestionService questionTest) {
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

    public String getId(){return id;}
    public QuestionService getQuestionTest() {
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
