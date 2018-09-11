package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.bodrov.staffskill.spring.model.DepartmentEnt;
import ru.bodrov.staffskill.spring.model.Manager;

@Repository(ManagerRepository.NAME)
public interface ManagerRepository extends PagingAndSortingRepository<Manager, String> {
    @NotNull
    String NAME = "managerRepository";
}
