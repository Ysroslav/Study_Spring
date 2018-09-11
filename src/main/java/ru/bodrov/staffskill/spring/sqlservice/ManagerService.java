package ru.bodrov.staffskill.spring.sqlservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.Manager;
import ru.bodrov.staffskill.spring.repository.DepartmentRepository;
import ru.bodrov.staffskill.spring.repository.ManagerRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    public Iterable<Manager> findAll(Sort sort) {
        return managerRepository.findAll(sort);
    }

    public Page<Manager> findAll(Pageable pageable) {
        return managerRepository.findAll(pageable);
    }

    public <S extends Manager> S save(S s) {
        return managerRepository.save(s);
    }

    public <S extends Manager> Iterable<S> saveAll(Iterable<S> iterable) {
        return managerRepository.saveAll(iterable);
    }

    public Optional<Manager> findById(String s) {
        return managerRepository.findById(s);
    }

    public boolean existsById(String s) {
        return managerRepository.existsById(s);
    }

    public Iterable<Manager> findAll() {
        return managerRepository.findAll();
    }

    public Iterable<Manager> findAllById(Iterable<String> iterable) {
        return managerRepository.findAllById(iterable);
    }

    public long count() {
        return managerRepository.count();
    }

    public void deleteById(String s) {
        managerRepository.deleteById(s);
    }

    public void delete(Manager manager) {
        managerRepository.delete(manager);
    }

    public void deleteAll(Iterable<? extends Manager> iterable) {
        managerRepository.deleteAll(iterable);
    }

    public void deleteAll() {
        managerRepository.deleteAll();
    }
}
