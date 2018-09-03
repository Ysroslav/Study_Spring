package ru.bodrov.staffskill.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.bodrov.staffskill.spring.annotation.InjectUUID;
import ru.bodrov.staffskill.spring.entity.TestService;

import java.util.logging.Logger;

@Component(QuestionService.NAME)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class QuestionTestService implements QuestionService {

    private static final Logger LOGGER = Logger.getAnonymousLogger();

    @InjectUUID
    private String id;

    @Autowired
    private TestServiceMind testStaff;

    private String questionText;

    @Value(TestService.typeQuestion)
    private String questionType;

    public TestServiceMind getTestStaff() {
        return testStaff;
    }
    public String getQuestionText() {
        return questionText;
    }
    public String getQuestionType() {
        return questionType;
    }
    public String getId(){return id;}


    public void setTestStaff(TestServiceMind testStaff) {
        this.testStaff = testStaff;
    }
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }
    public void setId(String id){this.id = id;}

}
