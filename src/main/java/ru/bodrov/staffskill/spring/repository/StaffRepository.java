package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.bodrov.staffskill.spring.model.DepartmentEnt;
import ru.bodrov.staffskill.spring.model.ResultEnt;
import ru.bodrov.staffskill.spring.model.StaffEnt;

@Repository(StaffRepository.NAME)
public interface StaffRepository extends PagingAndSortingRepository<StaffEnt, String> {
    @NotNull
    String NAME = "staffRepository";

    StaffEnt findByDepartment(DepartmentEnt department);

    StaffEnt findByLastName(String lastName);
}
