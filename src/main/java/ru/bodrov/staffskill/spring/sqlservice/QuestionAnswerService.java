package ru.bodrov.staffskill.spring.sqlservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.QuestionAnswerEnt;
import ru.bodrov.staffskill.spring.repository.QuestionAnswerRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@Transactional
public class QuestionAnswerService {

    @Autowired
    private QuestionAnswerRepository questionAnswerRepository;

    @Transactional(readOnly = true)
    public Iterable<QuestionAnswerEnt> findAll(Sort sort) {
        return questionAnswerRepository.findAll(sort);
    }

    @Transactional(readOnly = true)
    public Page<QuestionAnswerEnt> findAll(Pageable pageable) {
        return questionAnswerRepository.findAll(pageable);
    }

    @Transactional
    public <S extends QuestionAnswerEnt> S save(S s) {
        return questionAnswerRepository.save(s);
    }

    @Transactional
    public <S extends QuestionAnswerEnt> Iterable<S> saveAll(Iterable<S> iterable) {
        return questionAnswerRepository.saveAll(iterable);
    }

    @Transactional(readOnly = true)
    public Optional<QuestionAnswerEnt> findById(String s) {
        return questionAnswerRepository.findById(s);
    }

    @Transactional(readOnly = true)
    public boolean existsById(String s) {
        return questionAnswerRepository.existsById(s);
    }

    @Transactional(readOnly = true)
    public Iterable<QuestionAnswerEnt> findAll() {
        return questionAnswerRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Iterable<QuestionAnswerEnt> findAllById(Iterable<String> iterable) {
        return questionAnswerRepository.findAllById(iterable);
    }

    @Transactional(readOnly = true)
    public long count() {
        return questionAnswerRepository.count();
    }

    @Transactional
    public void deleteById(String s) {
        questionAnswerRepository.deleteById(s);
    }

    @Transactional
    public void delete(QuestionAnswerEnt questionAnswerEnt) {
        questionAnswerRepository.delete(questionAnswerEnt);
    }

    @Transactional
    public void deleteAll(Iterable<? extends QuestionAnswerEnt> iterable) {
        questionAnswerRepository.deleteAll(iterable);
    }

    @Transactional
    public void deleteAll() {
        questionAnswerRepository.deleteAll();
    }
}
