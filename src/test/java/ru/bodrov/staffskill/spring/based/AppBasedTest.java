package ru.bodrov.staffskill.spring.based;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.bodrov.staffskill.spring.entity.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AppBasedTest {

    @Test
    public void test(){
        /*final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationBased.class);
        final TestBased testBased = context.getBean(TestBased.class);
        final QuestionBased questionBased = context.getBean(QuestionBased.class);
        final AnswerBased answerBased = context.getBean(AnswerBased.class);
        assertNotNull(testBased);
        assertNotNull(questionBased);
        assertNotNull(answerBased);
        TestCase.assertEquals(testBased.getTestType(), TestService.typeTest);
        assertEquals(questionBased.getQuestionType(), TestService.typeQuestion);
        assertEquals(answerBased.getAnswerType(), TestService.typeAnswer);
        assertEquals(questionBased.getTestBased(),testBased);
        assertEquals(context.getBean(TestBased.NAME), testBased);*/

    }

}
