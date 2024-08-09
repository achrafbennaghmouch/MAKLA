package org.example.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("ADMIN")

public class Admin  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String prenom;
    private String nom;
}
