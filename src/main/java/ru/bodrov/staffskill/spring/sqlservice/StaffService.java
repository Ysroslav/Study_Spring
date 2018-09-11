package ru.bodrov.staffskill.spring.sqlservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.DepartmentEnt;
import ru.bodrov.staffskill.spring.model.StaffEnt;
import ru.bodrov.staffskill.spring.repository.StaffRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@Transactional
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Transactional(readOnly = true)
    public StaffEnt findByDepartment(DepartmentEnt department) {
        return staffRepository.findByDepartment(department);
    }

    @Transactional(readOnly = true)
    public StaffEnt findByLastName(String lastName) {
        return staffRepository.findByLastName(lastName);
    }

    @Transactional(readOnly = true)
    public Iterable<StaffEnt> findAll(Sort sort) {
        return staffRepository.findAll(sort);
    }

    @Transactional(readOnly = true)
    public Page<StaffEnt> findAll(Pageable pageable) {
        return staffRepository.findAll(pageable);
    }

    @Transactional
    public <S extends StaffEnt> S save(S s) {
        return staffRepository.save(s);
    }

    @Transactional
    public <S extends StaffEnt> Iterable<S> saveAll(Iterable<S> iterable) {
        return staffRepository.saveAll(iterable);
    }

    @Transactional(readOnly = true)
    public Optional<StaffEnt> findById(String s) {
        return staffRepository.findById(s);
    }

    @Transactional(readOnly = true)
    public boolean existsById(String s) {
        return staffRepository.existsById(s);
    }

    @Transactional(readOnly = true)
    public Iterable<StaffEnt> findAll() {
        return staffRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Iterable<StaffEnt> findAllById(Iterable<String> iterable) {
        return staffRepository.findAllById(iterable);
    }

    @Transactional(readOnly = true)
    public long count() {
        return staffRepository.count();
    }

    @Transactional
    public void deleteById(String s) {
        staffRepository.deleteById(s);
    }

    @Transactional
    public void delete(StaffEnt staffEnt) {
        staffRepository.delete(staffEnt);
    }

    @Transactional
    public void deleteAll(Iterable<? extends StaffEnt> iterable) {
        staffRepository.deleteAll(iterable);
    }

    @Transactional
    public void deleteAll() {
        staffRepository.deleteAll();
    }
}
