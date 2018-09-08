package ru.bodrov.staffskill.spring.sqlservice;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.DepartmentEnt;
import ru.bodrov.staffskill.spring.model.TestStaffEnt;
import ru.bodrov.staffskill.spring.repository.DepartmentRepository;
import ru.bodrov.staffskill.spring.repository.TestRepository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public @NotNull DepartmentEnt findOne(String id){return departmentRepository.findOne(id);}

    public @Nullable DepartmentEnt getById(String id){return departmentRepository.getById(id);}

    public @NotNull List<DepartmentEnt> findAll(){return departmentRepository.findAll();}

    public @NotNull DepartmentEnt removeById(String id){return departmentRepository.removeById(id);}

    public void persist(DepartmentEnt entity){departmentRepository.persist(entity);}

    public DepartmentEnt merge(DepartmentEnt entity){return departmentRepository.merge(entity);}

    public void removeAll(){departmentRepository.removeAll();}
}
