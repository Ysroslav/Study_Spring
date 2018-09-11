package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.bodrov.staffskill.spring.model.QuestionAnswerEnt;
import ru.bodrov.staffskill.spring.model.QuestionEnt;

@Repository(QuestionRepository.NAME)
public interface QuestionRepository extends PagingAndSortingRepository<QuestionEnt, String> {
    @NotNull
    String NAME = "questionRepository";
}
