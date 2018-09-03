package ru.bodrov.staffskill.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.bodrov.staffskill.spring.annotation.InjectUUID;
import ru.bodrov.staffskill.spring.entity.TestService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Component(TestServiceMind.NAME)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TestStaffService implements TestServiceMind {

    private static final Logger LOGGER = Logger.getAnonymousLogger();

    @InjectUUID
    private String id;

    @Value(TestService.typeTest)
    private String testType;

    @PostConstruct
    private void start(){LOGGER.info("INFO-POST STRUCT");}

    @PreDestroy
    private void stop(){LOGGER.info("INFO-PREDESTROY STRUCT");}

    public String getTestType() {
        return testType;
    }
    public String getId(){return id;}

    public void setTestType(String testType) {
        this.testType = testType;
    }
    public void setId(String id){this.id = id;}

}
