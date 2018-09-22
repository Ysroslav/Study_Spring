package ru.bodrov.staffskill.spring.sqlservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.bodrov.staffskill.spring.model.UserEnt;
import ru.bodrov.staffskill.spring.repository.UserRepository;

import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEnt findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Query(value = "SELECT e FROM UserEnt e WHERE e.email =:email")
    public UserEnt findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public long countByEmail(String email) {
        return userRepository.countByEmail(email);
    }

    public long countByLogin(String login) {
        return userRepository.countByLogin(login);
    }

    public Iterable<UserEnt> findAll(Sort sort) {
        return userRepository.findAll(sort);
    }

    public Page<UserEnt> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public <S extends UserEnt> S save(S s) {
        return userRepository.save(s);
    }

    public <S extends UserEnt> Iterable<S> saveAll(Iterable<S> iterable) {
        return userRepository.saveAll(iterable);
    }

    public Optional<UserEnt> findById(String s) {
        return userRepository.findById(s);
    }

    public boolean existsById(String s) {
        return userRepository.existsById(s);
    }

    public Iterable<UserEnt> findAll() {
        return userRepository.findAll();
    }

    public Iterable<UserEnt> findAllById(Iterable<String> iterable) {
        return userRepository.findAllById(iterable);
    }

    public long count() {
        return userRepository.count();
    }

    public void deleteById(String s) {
        userRepository.deleteById(s);
    }

    public void delete(UserEnt userEnt) {
        userRepository.delete(userEnt);
    }

    public void deleteAll(Iterable<? extends UserEnt> iterable) {
        userRepository.deleteAll(iterable);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }
}
