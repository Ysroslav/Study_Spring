package ru.bodrov.staffskill.spring.sqlservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.DictTestEnt;
import ru.bodrov.staffskill.spring.repository.DepartmentRepository;
import ru.bodrov.staffskill.spring.repository.DictTestRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@Transactional
public class DictTestService {

    @Autowired
    private DictTestRepository dictTestRepository;

    @Transactional(readOnly = true)
    public Iterable<DictTestEnt> findAll(Sort sort) {
        return dictTestRepository.findAll(sort);
    }

    @Transactional(readOnly = true)
    public Page<DictTestEnt> findAll(Pageable pageable) {
        return dictTestRepository.findAll(pageable);
    }

    @Transactional
    public <S extends DictTestEnt> S save(S s) {
        return dictTestRepository.save(s);
    }

    @Transactional
    public <S extends DictTestEnt> Iterable<S> saveAll(Iterable<S> iterable) {
        return dictTestRepository.saveAll(iterable);
    }

    @Transactional(readOnly = true)
    public Optional<DictTestEnt> findById(String s) {
        return dictTestRepository.findById(s);
    }

    @Transactional(readOnly = true)
    public boolean existsById(String s) {
        return dictTestRepository.existsById(s);
    }

    @Transactional(readOnly = true)
    public Iterable<DictTestEnt> findAll() {
        return dictTestRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Iterable<DictTestEnt> findAllById(Iterable<String> iterable) {
        return dictTestRepository.findAllById(iterable);
    }

    @Transactional(readOnly = true)
    public long count() {
        return dictTestRepository.count();
    }

    @Transactional
    public void deleteById(String s) {
        dictTestRepository.deleteById(s);
    }

    @Transactional
    public void delete(DictTestEnt dictTestEnt) {
        dictTestRepository.delete(dictTestEnt);
    }

    @Transactional
    public void deleteAll(Iterable<? extends DictTestEnt> iterable) {
        dictTestRepository.deleteAll(iterable);
    }

    @Transactional
    public void deleteAll() {
        dictTestRepository.deleteAll();
    }
}
