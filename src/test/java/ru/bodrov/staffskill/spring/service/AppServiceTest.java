package ru.bodrov.staffskill.spring.service;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.bodrov.staffskill.spring.entity.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@ComponentScan("ru.bodrov.staffskill.spring")
public class AppServiceTest {

    @Test
    public void test(){
        final ApplicationContext context = new AnnotationConfigApplicationContext(AppServiceTest.class);
        final TestServiceMind testStaff = context.getBean(TestServiceMind.class);
        final QuestionService questionTest = context.getBean(QuestionService.class);
        final AnswerService answerTest = context.getBean(AnswerService.class);
        assertNotNull(testStaff);
        assertNotNull(questionTest);
        assertNotNull(answerTest);
        final TestServiceMind testStaffByName = context.getBean(TestServiceMind.NAME, TestServiceMind.class);
        final QuestionService questionTestByName = context.getBean(QuestionService.NAME, QuestionService.class);
        final AnswerService answerTestByName = context.getBean(AnswerService.NAME, AnswerService.class);
        assertEquals(testStaff,testStaffByName);
        assertEquals(questionTest, questionTestByName);
        assertEquals(answerTest, answerTestByName);
        final TestStaffService testStaffBean = context.getBean(TestStaffService.class);
        final QuestionTestService questionTestBean = context.getBean(QuestionTestService.class);
        final AnswerTestService answerTestBean = context.getBean(AnswerTestService.class);
        assertNotNull(testStaffBean);
        assertNotNull(questionTestBean);
        assertNotNull(answerTestBean);
        assertNotNull(testStaffBean.getId());
        assertNotNull(questionTestBean.getId());
        assertNotNull(answerTestBean.getId());
        assertEquals(testStaff,testStaffBean);
        assertEquals(questionTest, questionTestBean);
        assertEquals(answerTest, answerTestBean);
    }
}
