package org.example.backend;

import jakarta.annotation.PostConstruct;
import org.example.backend.entities.Admin;
import org.example.backend.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class BackendApplication {

    @Autowired
    AdminService adminService;
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    }

