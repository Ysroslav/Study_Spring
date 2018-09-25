package ru.bodrov.staffskill.spring.sqlservice;

import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.bodrov.staffskill.spring.enums.RoleType;
import ru.bodrov.staffskill.spring.model.RoleEnt;
import ru.bodrov.staffskill.spring.model.UserEnt;
import ru.bodrov.staffskill.spring.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Nullable
    public UserEnt getUser(@Nullable final Principal principal){
        if(principal==null) return null;
        final String name = principal.getName();
        return userRepository.findByLogin(name);
    }

    @Transactional
    public void initUser(final String login, final String password, final String email){
        if(userRepository.countByLogin(login)>0) return;
        createUser(login, password, email);
    }

    @Transactional
    public void initUser(final String login, final String password, final String email, final RoleType roleType){
        if(userRepository.countByLogin(login)>0) return;
        createUser(login, password, email, roleType);
    }

    @Transactional
    public UserEnt createUser(final String login, final String password, final String email){
        final String passwordHash = passwordEncoder.encode(password);
        final UserEnt user = new UserEnt();
        user.setLogin(login);
        user.setPassword(passwordHash);
        user.setEmail(email);
        user.setDisabled(false);
        return userRepository.save(user);
    }

    @Transactional
    public UserEnt createUser(final String login, final String password, final String email, final RoleType roleType){
        final String passwordHash = passwordEncoder.encode(password);
        final UserEnt user = createUser(login, password, email);
        user.setPassword(passwordHash);
        user.setDisabled(false);
        user.getRoleEnts().add(new RoleEnt(user,roleType));
        return userRepository.save(user);
    }

}
