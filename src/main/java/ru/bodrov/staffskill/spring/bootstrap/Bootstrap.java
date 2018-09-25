package ru.bodrov.staffskill.spring.bootstrap;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.bodrov.staffskill.spring.enums.RoleType;
import ru.bodrov.staffskill.spring.sqlservice.AuthService;

@Component
public class Bootstrap implements InitializingBean {

    @Autowired
    private AuthService authService;

    @Override
    public void afterPropertiesSet() throws Exception{
        authService.initUser("admin", "admin", "admin@admin", RoleType.ADMINISTRATOR);
        authService.initUser("test", "test", "test@test", RoleType.USER);
    }
}
