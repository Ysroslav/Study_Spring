package ru.bodrov.staffskill.spring.sqlservice;

import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bodrov.staffskill.spring.model.UserEnt;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserService userService;

    @Nullable
    public UserEnt getUser(@Nullable final HttpServletRequest request){
        if(request == null) return null;
        final HttpSession httpSession = request.getSession();
        if(httpSession==null) return null;
        final Object userId = httpSession.getAttribute("userId");
        if(userId==null) return null;
        final String id = userId.toString();
        if(id.isEmpty()) return null;
        final Optional<UserEnt> optional = userService.findById(id);
        return optional.orElse(null);
    }
}
