package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.bodrov.staffskill.spring.model.DepartmentEnt;
import ru.bodrov.staffskill.spring.model.QuestionAnswerEnt;

@Repository(QuestionAnswerRepository.NAME)
public interface QuestionAnswerRepository extends PagingAndSortingRepository<QuestionAnswerEnt, String> {
    @NotNull
    String NAME = "questionAnswerRepository";
}