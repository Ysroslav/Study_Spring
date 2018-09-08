package ru.bodrov.staffskill.spring.sqlservice;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.QuestionAnswerEnt;
import ru.bodrov.staffskill.spring.model.QuestionEnt;
import ru.bodrov.staffskill.spring.repository.QuestionAnswerRepository;
import ru.bodrov.staffskill.spring.repository.QuestionRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public @NotNull QuestionEnt findOne(String id){return questionRepository.findOne(id);}

    public @Nullable QuestionEnt getById(String id){return questionRepository.getById(id);}

    public @NotNull List<QuestionEnt> findAll(){return questionRepository.findAll();}

    public @NotNull QuestionEnt removeById(String id){return questionRepository.removeById(id);}

    public void persist(QuestionEnt entity){questionRepository.persist(entity);}

    public QuestionEnt merge(QuestionEnt entity){return questionRepository.merge(entity);}

    public void removeAll(){questionRepository.removeAll();}
}
