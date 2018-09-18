package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.bodrov.staffskill.spring.model.AnswerEnt;
import ru.bodrov.staffskill.spring.model.DictTestEnt;

@Repository(DictTestRepository.NAME)
public interface DictTestRepository extends PagingAndSortingRepository<DictTestEnt, String> {
    @NotNull
    String NAME = "dictTestRepository";

    DictTestEnt findByNameType(String nameType);
}
