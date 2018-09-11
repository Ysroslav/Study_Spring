package ru.bodrov.staffskill.spring.sqlservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.DepartmentEnt;
import ru.bodrov.staffskill.spring.repository.DepartmentRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@Transactional
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional(readOnly = true)
    public DepartmentEnt findByDepartmentName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }

    @Transactional(readOnly = true)
    public Iterable<DepartmentEnt> findAll(Sort sort) {
        return departmentRepository.findAll(sort);
    }

    @Transactional(readOnly = true)
    public Page<DepartmentEnt> findAll(Pageable pageable) {
        return departmentRepository.findAll(pageable);
    }

    @Transactional
    public <S extends DepartmentEnt> S save(S s) {
        return departmentRepository.save(s);
    }

    @Transactional
    public <S extends DepartmentEnt> Iterable<S> saveAll(Iterable<S> iterable) {
        return departmentRepository.saveAll(iterable);
    }

    @Transactional(readOnly = true)
    public Optional<DepartmentEnt> findById(String s) {
        return departmentRepository.findById(s);
    }

    @Transactional(readOnly = true)
    public boolean existsById(String s) {
        return departmentRepository.existsById(s);
    }

    @Transactional(readOnly = true)
    public Iterable<DepartmentEnt> findAll() {
        return departmentRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Iterable<DepartmentEnt> findAllById(Iterable<String> iterable) {
        return departmentRepository.findAllById(iterable);
    }

    @Transactional(readOnly = true)
    public long count() {
        return departmentRepository.count();
    }

    @Transactional
    public void deleteById(String s) {
        departmentRepository.deleteById(s);
    }

    @Transactional
    public void delete(DepartmentEnt departmentEnt) {
        departmentRepository.delete(departmentEnt);
    }

    @Transactional
    public void deleteAll(Iterable<? extends DepartmentEnt> iterable) {
        departmentRepository.deleteAll(iterable);
    }

    @Transactional
    public void deleteAll() {
        departmentRepository.deleteAll();
    }
}
