package ru.bodrov.staffskill.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.bodrov.staffskill.spring.model.DictTestEnt;
import ru.bodrov.staffskill.spring.sqlservice.DictTestService;

import java.util.Optional;

@Controller
public class DictTestController {

    @Autowired
    private DictTestService dictTestService;

    @GetMapping("dicttest-list")
    public String dictTestList(final Model model){
        final Iterable<DictTestEnt> dictTestEnts = dictTestService.findAll();
        model.addAttribute("dictTestEnts", dictTestEnts);
        return "dicttest-list";
    }

    @GetMapping("dicttest-create")
    public String dictTestCreate(){
        final DictTestEnt dictTestEnt = new DictTestEnt();
        dictTestEnt.setNameType("New Test1");
        dictTestService.save(dictTestEnt);
        return "redirect:/dicttest-list";
    }

    @GetMapping("dicttest-edit/{id}")
    public String dictTestEdit(final Model model, @PathVariable("id") final String id){
        final Optional<DictTestEnt> dictTestEnt = dictTestService.findById(id);
        dictTestEnt.ifPresent(p->model.addAttribute("dictTestEnt", p));
        return "dicttest-edit";
    }

    @GetMapping("dicttest-save")
    public String dictTestSave(@ModelAttribute("dictTestEnt") final DictTestEnt dictTestEnt, final BindingResult result){
        if(!result.hasErrors()) dictTestService.save(dictTestEnt);
        return "redirect:/dicttest-list";
    }

    @GetMapping("dicttest-view/{id}")
    public String dictTestView(final Model model, @PathVariable("id") final String id) {
        final Optional<DictTestEnt> dictTestEnt = dictTestService.findById(id);
        dictTestEnt.ifPresent(p -> model.addAttribute("dictTestEnt", p));
        return "dicttest-view";
    }

    @GetMapping("dicttest-delete/{id}")
    public String dictTestDelete(@PathVariable("id") final String id){
        dictTestService.deleteById(id);
        return "redirect:/dicttest-list";
    }
}
