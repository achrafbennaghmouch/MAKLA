package org.example.backend.restcontrollers;


import org.example.backend.entities.Compte;
import org.example.backend.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CompteRestController {
    @Autowired
    CompteRepository compteRepository;

    @GetMapping(path = "/compte")
    public List<Compte> getAllUsersCompte() {
        return compteRepository.findAll();
    }
}

