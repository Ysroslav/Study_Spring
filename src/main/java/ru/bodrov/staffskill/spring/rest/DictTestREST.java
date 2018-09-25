package ru.bodrov.staffskill.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bodrov.staffskill.spring.dto.DictTestDTO;
import ru.bodrov.staffskill.spring.model.DictTestEnt;
import ru.bodrov.staffskill.spring.sqlservice.DictTestService;

//@RestController
//@RequestMapping("DictTestService")
public class DictTestREST {

    /*@Autowired
    private DictTestService dictTestService;

    @GetMapping(value="pingJSON", produces = "application/json")
    public DictTestDTO pingJSON(){
        final DictTestEnt dictTestEnt = dictTestService.findByNameType("New test");
        return new DictTestDTO(dictTestEnt);
    }

    @GetMapping(value="pingXML", produces = "application/xml")
    public DictTestDTO pingXML(){
        final DictTestEnt dictTestEnt = dictTestService.findByNameType("New test");
        return new DictTestDTO(dictTestEnt);
    }*/
}
