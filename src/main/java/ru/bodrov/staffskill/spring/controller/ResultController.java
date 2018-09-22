package ru.bodrov.staffskill.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import ru.bodrov.staffskill.spring.model.QuestionEnt;
import ru.bodrov.staffskill.spring.model.ResultEnt;
import ru.bodrov.staffskill.spring.sqlservice.QuestionService;
import ru.bodrov.staffskill.spring.sqlservice.ResultService;

import java.util.Optional;

@Controller
public class ResultController {

    @Autowired
    private ResultService resultService;

    @GetMapping("/profile/result-list")
    public String getListResults(final Model model){
        final Iterable<ResultEnt> results = resultService.findAll();
        model.addAttribute("results", results);
        return "/profile/result-list";
    }

    @GetMapping("/profile/result-delete/{id}")
    public String deleteResult(@PathVariable("id") final String id){
        resultService.deleteById(id);
        return "redirect:/profile/result-list";
    }
}
