package ru.bodrov.staffskill.spring.sqlservice;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.ResultEnt;
import ru.bodrov.staffskill.spring.model.StaffEnt;
import ru.bodrov.staffskill.spring.repository.ResultRepository;
import ru.bodrov.staffskill.spring.repository.StaffRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    public @NotNull StaffEnt findOne(String id){return staffRepository.findOne(id);}

    public @Nullable StaffEnt getById(String id){return staffRepository.getById(id);}

    public @NotNull List<StaffEnt> findAll(){return staffRepository.findAll();}

    public @NotNull StaffEnt removeById(String id){return staffRepository.removeById(id);}

    public void persist(StaffEnt entity){staffRepository.persist(entity);}

    public StaffEnt merge(StaffEnt entity){return staffRepository.merge(entity);}

    public void removeAll(){staffRepository.removeAll();}
}
