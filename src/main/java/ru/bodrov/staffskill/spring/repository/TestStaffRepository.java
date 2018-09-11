package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.bodrov.staffskill.spring.model.StaffEnt;
import ru.bodrov.staffskill.spring.model.TestStaffEnt;

@Repository(TestStaffRepository.NAME)
public interface TestStaffRepository extends PagingAndSortingRepository<TestStaffEnt, String> {
    @NotNull
    String NAME = "testStaffRepository";

    @Query(value = "SELECT min(minValueBall) FROM TestStaffEnt")
    int minValueBall();

    @Query(value = "SELECT max(minValueBall) FROM TestStaffEnt")
    int maxValueBall();
}
