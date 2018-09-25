package ru.bodrov.staffskill.spring.sqlservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.DictTestEnt;
import ru.bodrov.staffskill.spring.model.StaffEnt;
import ru.bodrov.staffskill.spring.model.TestStaffEnt;
import ru.bodrov.staffskill.spring.repository.TestStaffRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@Transactional
public class TestStaffService {

    @Autowired
    private TestStaffRepository testStaffRepository;


    @Transactional(readOnly = true)
    public Iterable<TestStaffEnt> findAll(Sort sort) {
        return testStaffRepository.findAll(sort);
    }

    @Transactional(readOnly = true)
    public Page<TestStaffEnt> findAll(Pageable pageable) {
        return testStaffRepository.findAll(pageable);
    }

    @Transactional
    public <S extends TestStaffEnt> S save(S s) {
        return testStaffRepository.save(s);
    }

    @Transactional
    public <S extends TestStaffEnt> Iterable<S> saveAll(Iterable<S> iterable) {
        return testStaffRepository.saveAll(iterable);
    }

    @Transactional(readOnly = true)
    public Optional<TestStaffEnt> findById(String s) {
        return testStaffRepository.findById(s);
    }

    @Transactional(readOnly = true)
    public boolean existsById(String s) {
        return testStaffRepository.existsById(s);
    }

    @Transactional(readOnly = true)
    public Iterable<TestStaffEnt> findAll() {
        return testStaffRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Iterable<TestStaffEnt> findAllById(Iterable<String> iterable) {
        return testStaffRepository.findAllById(iterable);
    }

    @Transactional(readOnly = true)
    public long count() {
        return testStaffRepository.count();
    }

    @Transactional
    public void deleteById(String s) {
        testStaffRepository.deleteById(s);
    }

    @Transactional
    public void delete(TestStaffEnt testStaffEnt) {
        testStaffRepository.delete(testStaffEnt);
    }

    @Transactional
    public void deleteAll(Iterable<? extends TestStaffEnt> iterable) {
        testStaffRepository.deleteAll(iterable);
    }

    @Transactional
    public void deleteAll() {
        testStaffRepository.deleteAll();
    }

    @Transactional(readOnly = true)
    public Iterable<TestStaffEnt> findByType(DictTestEnt type) {
        return testStaffRepository.findByType(type);
    }
}
