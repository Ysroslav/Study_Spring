package ru.bodrov.staffskill.spring.sqlservice;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.jetbrains.annotations.Nullable;
import ru.bodrov.staffskill.spring.model.TestStaffEnt;
import ru.bodrov.staffskill.spring.repository.TestRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public @NotNull TestStaffEnt findOne(String id){return testRepository.findOne(id);}

    public @Nullable TestStaffEnt getById(String id){return testRepository.getById(id);}

    public @NotNull List<TestStaffEnt> findAll(){return testRepository.findAll();}

    public @NotNull TestStaffEnt removeById(String id){return testRepository.removeById(id);}

    public void persist(TestStaffEnt entity){testRepository.persist(entity);}

    public TestStaffEnt merge(TestStaffEnt entity){return testRepository.merge(entity);}

    public void removeAll(){testRepository.removeAll();}

    public @Nullable TestStaffEnt getByTypeId(String typeId){return testRepository.getByTypeId(typeId);}

    public void removeByTypeId(final String typeId){ testRepository.removeTypeId(typeId);}
}
