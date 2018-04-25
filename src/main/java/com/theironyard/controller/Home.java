package com.theironyard.controller;

import com.theironyard.repositories.PeriodicaltextsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    @Autowired
    PeriodicaltextsRepository periodicaltextsRepository;

    @RequestMapping("/home")
    public String index(Model model) {



        model.addAttribute("periodicaltexts", periodicaltextsRepository.findAll());


        return "index";
    }

}
