package ru.bodrov.staffskill.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.bodrov.staffskill.spring.model.UserEnt;
import ru.bodrov.staffskill.spring.sqlservice.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(){
        return "/login";
    }

    @RequestMapping(value = "/loginAction" , method = RequestMethod.POST)
    public String loginProcess(
            final HttpServletRequest request,
            final HttpServletResponse response,
            @ModelAttribute("login") String login,
            @ModelAttribute("password") String password
            ){
        if(login == null || password == null) return "redirect:/login";
        if(login.isEmpty() || password.isEmpty()) return "redirect:/login";

        final UserEnt user = userService.findByLogin(login);
        if(user == null) return "redirect:/login";

        final HttpSession session = request.getSession();
        session.setAttribute("auth", true);
        session.setAttribute("userId", user.getId());
        return "redirect:/admin/index";
    }
}
