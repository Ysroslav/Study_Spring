package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.bodrov.staffskill.spring.model.AnswerEnt;
import ru.bodrov.staffskill.spring.model.DepartmentEnt;

@Repository(DepartmentRepository.NAME)
public interface DepartmentRepository extends PagingAndSortingRepository<DepartmentEnt, String> {
    @NotNull
    String NAME = "departmentRepository";

    //@Query(value = "SELECT e FROM DepartmentEnt WHERE e.departmentName = : departmentName")
    DepartmentEnt findByDepartmentName(String departmentName);
}
