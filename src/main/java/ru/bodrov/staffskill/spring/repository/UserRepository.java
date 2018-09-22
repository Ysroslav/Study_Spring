package ru.bodrov.staffskill.spring.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.bodrov.staffskill.spring.model.TestStaffEnt;
import ru.bodrov.staffskill.spring.model.UserEnt;

@Repository(UserRepository.NAME)
public interface UserRepository extends PagingAndSortingRepository<UserEnt, String> {

    @NotNull
    String NAME = "userRepository";

    UserEnt findByLogin(String login);

    @Query(value = "SELECT e FROM UserEnt e WHERE e.email =:email")
    UserEnt findByEmail(@Param("email") String email);

    long countByEmail(@Param("email") String email);

    long countByLogin(String login);
}
