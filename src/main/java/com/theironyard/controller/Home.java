package com.theironyard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    @RequestMapping("/home")
    public String index(Model model) {

        model.addAttribute("periodicaltexts", periodicaltextsRepository.findAll());
        return "index";
    }

}
