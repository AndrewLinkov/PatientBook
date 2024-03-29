package com.example.PatientBook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("title", "Главная старница");
        return "home";
    }

    @GetMapping("/newProfile")
    public String newProfile(Model model) {
        model.addAttribute("title", "Страница новая анкета");
        return "newProfile";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Страница про нас");
        return "about";
    }
}