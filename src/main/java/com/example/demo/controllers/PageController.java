package com.example.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PageController {

    @GetMapping
    public String home(Model model) {
        model.addAttribute("message", "Benvenuto in Thymeleaf!");
        return "home"; // Questa stringa si riferisce a templates/home.html
    }

    @GetMapping("/vue")
    public String vue(Model model) {
        model.addAttribute("message", "Benvenuto in Thymeleaf!");
        model.addAttribute("vueMessage", "Benvenuto in Vue!");
        model.addAttribute("tailwindMessage", "Benvenuto in Tailwind!");
        return "vue";
    }
}
