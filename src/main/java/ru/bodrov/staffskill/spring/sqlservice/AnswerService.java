package ru.bodrov.staffskill.spring.sqlservice;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.AnswerEnt;
import ru.bodrov.staffskill.spring.repository.AnswerRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Transactional(readOnly = true)
    public Iterable<AnswerEnt> findAll(Sort sort) {
        return answerRepository.findAll(sort);
    }

    @Transactional(readOnly = true)
    public Page<AnswerEnt> findAll(Pageable pageable) {
        return answerRepository.findAll(pageable);
    }

    @Transactional
    public <S extends AnswerEnt> S save(S s) {
        return answerRepository.save(s);
    }

    @Transactional
    public <S extends AnswerEnt> Iterable<S> saveAll(Iterable<S> iterable) {
        return answerRepository.saveAll(iterable);
    }

    @Transactional(readOnly = true)
    public Optional<AnswerEnt> findById(String s) {
        return answerRepository.findById(s);
    }

    @Transactional(readOnly = true)
    public boolean existsById(String s) {
        return answerRepository.existsById(s);
    }

    @Transactional(readOnly = true)
    public Iterable<AnswerEnt> findAll() {
        return answerRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Iterable<AnswerEnt> findAllById(Iterable<String> iterable) {
        return answerRepository.findAllById(iterable);
    }

    @Transactional(readOnly = true)
    public long count() {
        return answerRepository.count();
    }

    @Transactional
    public void deleteById(String s) {
        answerRepository.deleteById(s);
    }

    @Transactional
    public void delete(AnswerEnt answerEnt) {
        answerRepository.delete(answerEnt);
    }

    @Transactional
    public void deleteAll(Iterable<? extends AnswerEnt> iterable) {
        answerRepository.deleteAll(iterable);
    }

    @Transactional
    public void deleteAll() {
        answerRepository.deleteAll();
    }
}


