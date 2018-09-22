package ru.bodrov.staffskill.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import ru.bodrov.staffskill.spring.model.DepartmentEnt;
import ru.bodrov.staffskill.spring.model.QuestionEnt;
import ru.bodrov.staffskill.spring.sqlservice.DepartmentService;
import ru.bodrov.staffskill.spring.sqlservice.QuestionService;

import java.util.Optional;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/profile/question-list")
    public String getListQuestions(final Model model){
        final Iterable<QuestionEnt> questions = questionService.findAll();
        model.addAttribute("questions", questions);
        return "/profile/question-list";
    }

    @GetMapping("/profile/question-create")
    public String createNewQuestion(){
        final QuestionEnt question = new QuestionEnt();
        question.setQuestionText("New question");
        questionService.save(question);
        return "redirect:/profile/question-list";
    }

    @GetMapping("/profile/question-edit/{id}")
    public String editQuestion(final Model model, @PathVariable("id") final String id){
        final Optional<QuestionEnt> question = questionService.findById(id);
        question.ifPresent(p->model.addAttribute("question", p));
        return "/profile/question-edit";
    }

    @GetMapping("/profile/question-save")
    public String saveNewQuestion(@ModelAttribute("question") final QuestionEnt question, final BindingResult result){
        if(!result.hasErrors()) questionService.save(question);
        return "redirect:/profile/question-list";
    }

    @GetMapping("/profile/question-view/{id}")
    public String getViewQuestion(final Model model, @PathVariable("id") final String id) {
        final Optional<QuestionEnt> question = questionService.findById(id);
        question.ifPresent(p -> model.addAttribute("question", p));
        return "/profile/question-view";
    }

    @GetMapping("/profile/question-delete/{id}")
    public String deleteQuestion(@PathVariable("id") final String id){
        questionService.deleteById(id);
        return "redirect:/profile/question-list";
    }
}
