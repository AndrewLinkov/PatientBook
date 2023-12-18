package com.example.PatientBook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    //метод вызывает старницу
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/dataPatient")
    public String dataPatient() {
        return "dataPatient";
    }
}