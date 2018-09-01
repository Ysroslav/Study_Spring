package ru.bodrov.staffskill.spring.entity;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AppAnnotationTest {

    @Test
    public void test(){
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        final TestStaff testStaff = context.getBean(TestStaff.class);
        final QuestionTest questionTest = context.getBean(QuestionTest.class);
        final AnswerTest answerTest = context.getBean(AnswerTest.class);
        assertNotNull(testStaff);
        assertNotNull(questionTest);
        assertNotNull(answerTest);
        TestCase.assertEquals(testStaff.getTestType(), TestService.typeTest);
        assertEquals(questionTest.getQuestionType(), TestService.typeQuestion);
        assertEquals(answerTest.getAnswerType(), TestService.typeAnswer);
        assertEquals(questionTest.getTestStaff(),testStaff);
        assertEquals(context.getBean(TestStaff.NAME), testStaff);

    }
}
