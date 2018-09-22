package ru.bodrov.staffskill.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import ru.bodrov.staffskill.spring.model.QuestionEnt;
import ru.bodrov.staffskill.spring.model.StaffEnt;
import ru.bodrov.staffskill.spring.sqlservice.QuestionService;
import ru.bodrov.staffskill.spring.sqlservice.StaffService;

import java.util.Optional;

@Controller
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping("/profile/staff-list")
    public String getListStaffs(final Model model){
        final Iterable<StaffEnt> staffs = staffService.findAll();
        model.addAttribute("staffs", staffs);
        return "/profile/staff-list";
    }

    @GetMapping("/profile/staff-create")
    public String createNewStaff(){
        final StaffEnt staff = new StaffEnt();
        staff.setFirstName("First Name");
        staff.setLastName("Last Name");
        staffService.save(staff);
        return "redirect:/profile/staff-list";
    }

    @GetMapping("/profile/staff-edit/{id}")
    public String editStaff(final Model model, @PathVariable("id") final String id){
        final Optional<StaffEnt> staff = staffService.findById(id);
        staff.ifPresent(p->model.addAttribute("staff", p));
        return "/profile/staff-edit";
    }

    @GetMapping("/profile/staff-save")
    public String saveNewStaff(@ModelAttribute("staff") final StaffEnt staff, final BindingResult result){
        if(!result.hasErrors()) staffService.save(staff);
        return "redirect:/profile/staff-list";
    }

    @GetMapping("/profile/staff-view/{id}")
    public String getViewStaff(final Model model, @PathVariable("id") final String id) {
        final Optional<StaffEnt> staff = staffService.findById(id);
        staff.ifPresent(p -> model.addAttribute("staff", p));
        return "/profile/staff-view";
    }

    @GetMapping("/profile/staff-delete/{id}")
    public String deleteStaff(@PathVariable("id") final String id){
        staffService.deleteById(id);
        return "redirect:/profile/staff-list";
    }
}
