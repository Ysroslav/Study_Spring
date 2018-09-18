package ru.bodrov.staffskill.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.bodrov.staffskill.spring.entity.StatisticalTest;
import ru.bodrov.staffskill.spring.model.DictTestEnt;
import ru.bodrov.staffskill.spring.model.TestStaffEnt;
import ru.bodrov.staffskill.spring.sqlservice.DictTestService;
import ru.bodrov.staffskill.spring.sqlservice.ResultService;
import ru.bodrov.staffskill.spring.sqlservice.TestStaffService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainAdminController {

    @Autowired
    private TestStaffService testStaffService;

    @Autowired
    private ResultService resultService;

    @GetMapping("index")
    public String getStatisticTests(final Model model){
        final Iterable<TestStaffEnt> testsStaff = testStaffService.findAll();
        List<StatisticalTest> list = new ArrayList<>();
        for (TestStaffEnt testOne: testsStaff) {
            final StatisticalTest statisticalTest = new StatisticalTest(testOne);
            statisticalTest.setAmountStaff(resultService.countByTest(testOne));
            statisticalTest.setAmountStaffSuccess(resultService.countByTestSuccess(testOne.getMinValueBall(),testOne));
            statisticalTest.setAvgBall(resultService.avgBallByTest(testOne));
            statisticalTest.setMaxBall(resultService.maxBallByTest(testOne));
            statisticalTest.setMinBall(resultService.minBallByTest(testOne));
            statisticalTest.setLastTest(resultService.maxDateByTest(testOne));
            list.add(statisticalTest);
        }
        model.addAttribute("statisticalTests", list);
        return "index";
    }
}
