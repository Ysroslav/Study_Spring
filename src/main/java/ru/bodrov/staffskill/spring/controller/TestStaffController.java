package ru.bodrov.staffskill.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import ru.bodrov.staffskill.spring.model.DictTestEnt;
import ru.bodrov.staffskill.spring.model.StaffEnt;
import ru.bodrov.staffskill.spring.model.TestStaffEnt;
import ru.bodrov.staffskill.spring.sqlservice.DictTestService;
import ru.bodrov.staffskill.spring.sqlservice.StaffService;
import ru.bodrov.staffskill.spring.sqlservice.TestStaffService;

import java.util.Optional;

@Controller
public class TestStaffController {

    @Autowired
    private TestStaffService testStaffService;

    @Autowired
    private DictTestService dictTestService;

    @GetMapping("/profile/poll-list/{id}")
    public String getListTPolls(final Model model, @PathVariable("id")final String id){
        final Optional<DictTestEnt> dictTests = dictTestService.findById(id);
        if(dictTests.isPresent()) {
            final DictTestEnt dictTest = dictTests.get();
            final Iterable<TestStaffEnt> tests = testStaffService.findByType(dictTest);
            model.addAttribute("tests", tests);
            return "/profile/poll-list";
        }
        return "redirect: profile/index";
    }
}
