package ru.bodrov.staffskill.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import ru.bodrov.staffskill.spring.model.DepartmentEnt;
import ru.bodrov.staffskill.spring.model.DictTestEnt;
import ru.bodrov.staffskill.spring.sqlservice.DepartmentService;
import ru.bodrov.staffskill.spring.sqlservice.DictTestService;

import java.util.Optional;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("profile/department-list")
    public String getListDepartments(final Model model){
        final Iterable<DepartmentEnt> departments = departmentService.findAll();
        model.addAttribute("departments", departments);
        return "/profile/department-list";
    }

    @GetMapping("/profile/department-create")
    public String createNewDepartment(){
        final DepartmentEnt department = new DepartmentEnt();
        department.setDepartmentName("New department");
        departmentService.save(department);
        return "redirect:/profile/department-list";
    }

    @GetMapping("/profile/department-edit/{id}")
    public String editDepartment(final Model model, @PathVariable("id") final String id){
        final Optional<DepartmentEnt> department = departmentService.findById(id);
        department.ifPresent(p->model.addAttribute("department", p));
        return "/profile/department-edit";
    }

    @GetMapping("/profile/department-save")
    public String saveNewDepartment(@ModelAttribute("department") final DepartmentEnt department, final BindingResult result){
        if(!result.hasErrors()) departmentService.save(department);
        return "redirect:/profile/department-list";
    }

    @GetMapping("/profile/department-view/{id}")
    public String getViewDepartment(final Model model, @PathVariable("id") final String id) {
        final Optional<DepartmentEnt> department = departmentService.findById(id);
       department.ifPresent(p -> model.addAttribute("department", p));
        return "/profile/department-view";
    }

    @GetMapping("/profile/department-delete/{id}")
    public String deleteDepartment(@PathVariable("id") final String id){
        departmentService.deleteById(id);
        return "redirect:/profile/department-list";
    }
}
