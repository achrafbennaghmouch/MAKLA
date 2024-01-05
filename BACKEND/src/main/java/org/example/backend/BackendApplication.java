package org.example.backend;

import org.example.backend.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BackendApplication {
@Autowired
    CompteRepository compteRepository;
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

}
