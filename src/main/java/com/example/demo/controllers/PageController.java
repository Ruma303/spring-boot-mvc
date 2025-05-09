package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        model.addAttribute("pageTitle", "Home Page");
        return "home"; // Questa stringa si riferisce a templates/home.html
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("message", "Benvenuto nella pagina about!");
        model.addAttribute("vueMessage", "Benvenuto in Vue!");
        model.addAttribute("tailwindMessage", "Benvenuto in Tailwind!");
        model.addAttribute("pageTitle", "About Page");
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("message", "Contattaci!");
        model.addAttribute("pageTitle", "Contact Page");
        return "contact";
    }

    @GetMapping("/error")
    public String error(Model model) {
        model.addAttribute("message", "Si è verificato un errore!");
        model.addAttribute("pageTitle", "Error Page");
        return "error";
    }
}
