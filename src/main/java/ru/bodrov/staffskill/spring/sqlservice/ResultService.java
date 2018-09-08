package ru.bodrov.staffskill.spring.sqlservice;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.QuestionEnt;
import ru.bodrov.staffskill.spring.model.ResultEnt;
import ru.bodrov.staffskill.spring.repository.QuestionRepository;
import ru.bodrov.staffskill.spring.repository.ResultRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    public @NotNull ResultEnt findOne(String id){return resultRepository.findOne(id);}

    public @Nullable ResultEnt getById(String id){return resultRepository.getById(id);}

    public @NotNull List<ResultEnt> findAll(){return resultRepository.findAll();}

    public @NotNull ResultEnt removeById(String id){return resultRepository.removeById(id);}

    public void persist(ResultEnt entity){resultRepository.persist(entity);}

    public ResultEnt merge(ResultEnt entity){return resultRepository.merge(entity);}

    public void removeAll(){resultRepository.removeAll();}
}
