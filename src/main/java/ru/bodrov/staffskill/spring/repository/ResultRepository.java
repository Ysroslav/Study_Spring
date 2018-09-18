package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.bodrov.staffskill.spring.model.QuestionEnt;
import ru.bodrov.staffskill.spring.model.ResultEnt;
import ru.bodrov.staffskill.spring.model.StaffEnt;
import ru.bodrov.staffskill.spring.model.TestStaffEnt;

import java.sql.Date;

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

    int countByTest(@Param("test") TestStaffEnt test);

    @Query(value = "SELECT count(id) FROM ResultEnt WHERE ballResult>=:minBall and test =:test")
    int countByTestSuccess(@Param("minBall") int minValueBall, @Param("test")TestStaffEnt test);

    @Query(value = "SELECT avg(ballResult) FROM ResultEnt WHERE test =:test")
    int avgBallByTest(@Param("test")TestStaffEnt test);

    @Query(value = "SELECT max(ballResult) FROM ResultEnt WHERE test =:test")
    int maxBallByTest(@Param("test")TestStaffEnt test);

    @Query(value = "SELECT min(ballResult) FROM ResultEnt WHERE test =:test")
    int minBallByTest(@Param("test")TestStaffEnt test);

    @Query(value = "SELECT max(dateTest) FROM ResultEnt WHERE test =:test")
    Date maxDateByTest(@Param("test")TestStaffEnt test);
}
