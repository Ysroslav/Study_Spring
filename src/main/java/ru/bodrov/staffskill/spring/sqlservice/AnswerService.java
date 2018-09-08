package ru.bodrov.staffskill.spring.sqlservice;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.AnswerEnt;
import ru.bodrov.staffskill.spring.model.DepartmentEnt;
import ru.bodrov.staffskill.spring.repository.AnswerRepository;
import ru.bodrov.staffskill.spring.repository.DepartmentRepository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    public @NotNull AnswerEnt findOne(String id){return answerRepository.findOne(id);}

    public @Nullable AnswerEnt getById(String id){return answerRepository.getById(id);}

    public @NotNull List<AnswerEnt> findAll(){return answerRepository.findAll();}

    public @NotNull AnswerEnt removeById(String id){return answerRepository.removeById(id);}

    public void persist(AnswerEnt entity){answerRepository.persist(entity);}

    public AnswerEnt merge(AnswerEnt entity){return answerRepository.merge(entity);}

    public void removeAll(){answerRepository.removeAll();}
}
