package ru.bodrov.staffskill.spring.sqlservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.ResultEnt;
import ru.bodrov.staffskill.spring.model.StaffEnt;
import ru.bodrov.staffskill.spring.model.TestStaffEnt;
import ru.bodrov.staffskill.spring.repository.ResultRepository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.Optional;

@Service
@Transactional
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    @Transactional(readOnly = true)
    public ResultEnt findByStaff(StaffEnt staffEnt) {
        return resultRepository.findByStaff(staffEnt);
    }

    @Transactional(readOnly = true)
    public long countByStaff(StaffEnt staffEnt) {
        return resultRepository.countByStaff(staffEnt);
    }

    @Transactional(readOnly = true)
    @Query(value = "SELECT min(ballResult) FROM ResultEnt")
    public int minByBallResult() {
        return resultRepository.minByBallResult();
    }

    @Transactional(readOnly = true)
    @Query(value = "SELECT max(ballResult) FROM ResultEnt")
    public int maxByBallResult() {
        return resultRepository.maxByBallResult();
    }

    @Transactional(readOnly = true)
    @Query(value = "SELECT sum(ballResult) FROM ResultEnt")
    public int sumByBallResult() {
        return resultRepository.sumByBallResult();
    }

    @Transactional(readOnly = true)
    public Iterable<ResultEnt> findAll(Sort sort) {
        return resultRepository.findAll(sort);
    }

    @Transactional(readOnly = true)
    public Page<ResultEnt> findAll(Pageable pageable) {
        return resultRepository.findAll(pageable);
    }

    @Transactional
    public <S extends ResultEnt> S save(S s) {
        return resultRepository.save(s);
    }

    @Transactional
    public <S extends ResultEnt> Iterable<S> saveAll(Iterable<S> iterable) {
        return resultRepository.saveAll(iterable);
    }

    @Transactional(readOnly = true)
    public Optional<ResultEnt> findById(String s) {
        return resultRepository.findById(s);
    }

    @Transactional(readOnly = true)
    public boolean existsById(String s) {
        return resultRepository.existsById(s);
    }

    @Transactional(readOnly = true)
    public Iterable<ResultEnt> findAll() {
        return resultRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Iterable<ResultEnt> findAllById(Iterable<String> iterable) {
        return resultRepository.findAllById(iterable);
    }

    @Transactional(readOnly = true)
    public long count() {
        return resultRepository.count();
    }

    @Transactional
    public void deleteById(String s) {
        resultRepository.deleteById(s);
    }

    @Transactional
    public void delete(ResultEnt resultEnt) {
        resultRepository.delete(resultEnt);
    }

    @Transactional
    public void deleteAll(Iterable<? extends ResultEnt> iterable) {
        resultRepository.deleteAll(iterable);
    }

    @Transactional
    public void deleteAll() {
        resultRepository.deleteAll();
    }

    @Transactional(readOnly = true)
    public int countByTest(TestStaffEnt test) {
        return resultRepository.countByTest(test);
    }

    @Query(value = "SELECT count(id) FROM ResultEnt WHERE ballResult>=:minBall and test =:test")
    public int countByTestSuccess(int minValueBall, TestStaffEnt test) {
        return resultRepository.countByTestSuccess(minValueBall, test);
    }

    @Query(value = "SELECT avg(ballResult) FROM ResultEnt WHERE test =:test")
    public int avgBallByTest(TestStaffEnt test) {
        return resultRepository.avgBallByTest(test);
    }

    @Query(value = "SELECT max(ballResult) FROM ResultEnt WHERE test =:test")
    public int maxBallByTest(TestStaffEnt test) {
        return resultRepository.maxBallByTest(test);
    }

    @Query(value = "SELECT min(ballResult) FROM ResultEnt WHERE test =:test")
    public int minBallByTest(TestStaffEnt test) {
        return resultRepository.minBallByTest(test);
    }

    @Query(value = "SELECT max(dateTest) FROM ResultEnt WHERE test =:test")
    public Date maxDateByTest(TestStaffEnt test) {
        return resultRepository.maxDateByTest(test);
    }
}
