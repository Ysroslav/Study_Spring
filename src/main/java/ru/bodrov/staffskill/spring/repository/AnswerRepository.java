package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.bodrov.staffskill.spring.model.AnswerEnt;

@Repository(AnswerRepository.NAME)
public interface AnswerRepository extends PagingAndSortingRepository<AnswerEnt, String> {
    @NotNull
    String NAME = "answerRepository";
}