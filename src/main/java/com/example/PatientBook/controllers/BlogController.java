package com.example.PatientBook.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/blog")
    public String blogMain(Model model) {
        return "blog-main";
    }
}
