package com.example.demo.controllers;

import com.example.demo.models.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public String getUsers() {
        return "Lista degli utenti";
    }

    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        return "Utente creato: " + user.toString();
    }

    @PutMapping("/users/{id}")
    public String updateUser(@PathVariable int id) {
        return "Utente con ID " + id + " aggiornato";
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        return "Utente con ID " + id + " eliminato";
    }

    @GetMapping("/user")
    public String getUser(
            @RequestParam String name,
            @RequestParam("last_name") String lastName
    ) {
        return "Utente con nome " + name + " e cognome " + lastName;
    }

}