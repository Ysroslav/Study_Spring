package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.bodrov.staffskill.spring.model.QuestionEnt;
import ru.bodrov.staffskill.spring.model.ResultEnt;
import ru.bodrov.staffskill.spring.model.StaffEnt;

@Repository(ResultRepository.NAME)
public interface ResultRepository extends PagingAndSortingRepository<ResultEnt, String> {
    @NotNull
    String NAME = "resultRepository";

    ResultEnt findByStaff(StaffEnt staffEnt);

    long countByStaff(StaffEnt staffEnt);

    @Query(value = "SELECT min(ballResult) FROM ResultEnt")
    int minByBallResult();

    @Query(value = "SELECT max(ballResult) FROM ResultEnt")
    int maxByBallResult();

    @Query(value = "SELECT sum(ballResult) FROM ResultEnt")
    int sumByBallResult();
}
