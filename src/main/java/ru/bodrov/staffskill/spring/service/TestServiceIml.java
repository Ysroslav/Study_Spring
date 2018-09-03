package ru.bodrov.staffskill.spring.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component(TestServiceIml.NAME)
public class TestServiceIml implements TestServiceMind {

    public static final String NAME = "MIND_TEST";

}
