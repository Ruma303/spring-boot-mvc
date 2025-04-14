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
@RequestMapping("/api/users")
public class UserController {

    @GetMapping()
    public String getUsers() {
        return "Lista degli utenti";
    }

    @GetMapping("/{name}/{lastName}")
    public String getUser(
            @PathVariable String name,
            @PathVariable("lastName") String lastName
    ) {
        return "Utente con nome " + name + " e cognome " + lastName;
    }

    @GetMapping("/search")
    public String search(
            @RequestParam(name = "name", required = true, defaultValue = "N/D") String name,
            @RequestParam(name = "limit", required = false, defaultValue = "10") int limit,
            @RequestParam(name = "sort", required = false, defaultValue = "asc") String sortOrder
    ) {
        return "Utenti trovati per la ricerca: " + name + ", Limite: " + limit + ", Ordinamento: " + sortOrder;
    }

    @PostMapping()
    public String createUser(@RequestBody User user) {
        return "Utente creato: " + user.toString();
    }

    @PutMapping("{id}")
    public String updateUser(@PathVariable int id) {
        return "Utente con ID " + id + " aggiornato";
    }

    @DeleteMapping("{id}")
    public String deleteUser(@PathVariable int id) {
        return "Utente con ID " + id + " eliminato";
    }
}