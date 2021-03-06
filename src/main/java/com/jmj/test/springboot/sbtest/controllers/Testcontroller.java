package com.jmj.test.springboot.sbtest.controllers;

import com.jmj.test.springboot.sbtest.dao.Person;
import com.jmj.test.springboot.sbtest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Testcontroller {

    @Autowired
    PersonService personService;

    @RequestMapping("/")
    public String main(){
        StringBuffer sb = new StringBuffer();
        List<Person> personer = personService.searchEtternavn("Johansen");
        personer.forEach(x -> sb.append(x + "\'"));

        return sb.toString();
    }


}
