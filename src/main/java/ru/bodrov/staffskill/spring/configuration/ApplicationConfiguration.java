package ru.bodrov.staffskill.spring.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("ru.bodrov.staffskill.spring")
@EnableJpaRepositories("ru.bodrov.staffskill.spring.repository")
@Import(DataSourceConfiguration.class)
public class ApplicationConfiguration {
}
