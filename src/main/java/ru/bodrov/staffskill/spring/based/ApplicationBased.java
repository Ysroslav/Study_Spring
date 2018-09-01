package ru.bodrov.staffskill.spring.based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.bodrov.staffskill.spring.entity.TestService;

@Configuration
public class ApplicationBased {

    @Bean(name = TestBased.NAME)
    public TestBased testBased(){
        return new TestBased(TestService.typeTest);
    }

    @Bean
    public QuestionBased questionBased(final TestBased testBased){
        return new QuestionBased(testBased, TestService.typeQuestion);
    }

    @Bean
    public AnswerBased answerBased(final QuestionBased questionBased){
        return new AnswerBased(questionBased, TestService.typeAnswer);
    }
}
