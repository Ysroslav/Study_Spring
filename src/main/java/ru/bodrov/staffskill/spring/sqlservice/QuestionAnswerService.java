package ru.bodrov.staffskill.spring.sqlservice;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.AnswerEnt;
import ru.bodrov.staffskill.spring.model.QuestionAnswerEnt;
import ru.bodrov.staffskill.spring.repository.AnswerRepository;
import ru.bodrov.staffskill.spring.repository.QuestionAnswerRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class QuestionAnswerService {

    @Autowired
    private QuestionAnswerRepository questionAnswerRepository;

    public @NotNull QuestionAnswerEnt findOne(String id){return questionAnswerRepository.findOne(id);}

    public @Nullable QuestionAnswerEnt getById(String id){return questionAnswerRepository.getById(id);}

    public @NotNull List<QuestionAnswerEnt> findAll(){return questionAnswerRepository.findAll();}

    public @NotNull QuestionAnswerEnt removeById(String id){return questionAnswerRepository.removeById(id);}

    public void persist(QuestionAnswerEnt entity){questionAnswerRepository.persist(entity);}

    public QuestionAnswerEnt merge(QuestionAnswerEnt entity){return questionAnswerRepository.merge(entity);}

    public void removeAll(){questionAnswerRepository.removeAll();}
}
