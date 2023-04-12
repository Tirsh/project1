package com.tirsh.controller;

import com.tirsh.dao.PersonDAO;
import com.tirsh.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.time.LocalDate;

@Controller
@RequestMapping("/people")
public class PersonController {
    PersonDAO personDAO;

    public PersonController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()
    public String show(Model model){
        model.addAttribute("people", personDAO.showAll());
        System.out.println(personDAO.showAll());
        return "/people/index";
    }
    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("person", new Person());
        return "/people/add";
    }

    @PostMapping
    public String create(@ModelAttribute("person") @Valid Person person){
        System.out.println(person);
        personDAO.create(person);
        return "redirect:/people";
    }
}
