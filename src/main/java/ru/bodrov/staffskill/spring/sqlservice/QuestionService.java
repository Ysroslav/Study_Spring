package ru.bodrov.staffskill.spring.sqlservice;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.AnswerEnt;
import ru.bodrov.staffskill.spring.model.QuestionEnt;
import ru.bodrov.staffskill.spring.repository.AnswerRepository;
import ru.bodrov.staffskill.spring.repository.QuestionRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Transactional(readOnly = true)
    public Iterable<QuestionEnt> findAll(Sort sort) {
        return questionRepository.findAll(sort);
    }

    @Transactional(readOnly = true)
    public Page<QuestionEnt> findAll(Pageable pageable) {
        return questionRepository.findAll(pageable);
    }

    @Transactional
    public <S extends QuestionEnt> S save(S s) {
        return questionRepository.save(s);
    }

    @Transactional
    public <S extends QuestionEnt> Iterable<S> saveAll(Iterable<S> iterable) {
        return questionRepository.saveAll(iterable);
    }

    @Transactional(readOnly = true)
    public Optional<QuestionEnt> findById(String s) {
        return questionRepository.findById(s);
    }

    @Transactional(readOnly = true)
    public boolean existsById(String s) {
        return questionRepository.existsById(s);
    }

    @Transactional(readOnly = true)
    public Iterable<QuestionEnt> findAll() {
        return questionRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Iterable<QuestionEnt> findAllById(Iterable<String> iterable) {
        return questionRepository.findAllById(iterable);
    }

    @Transactional(readOnly = true)
    public long count() {
        return questionRepository.count();
    }

    @Transactional
    public void deleteById(String s) {
        questionRepository.deleteById(s);
    }

    @Transactional
    public void delete(QuestionEnt questionEnt) {
        questionRepository.delete(questionEnt);
    }

    @Transactional
    public void deleteAll(Iterable<? extends QuestionEnt> iterable) {
        questionRepository.deleteAll(iterable);
    }

    @Transactional
    public void deleteAll() {
        questionRepository.deleteAll();
    }
}
