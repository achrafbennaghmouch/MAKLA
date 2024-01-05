package org.example.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("ADMIN")

public class Admin extends Compte {


    private String prenom;
    private String nom;

    @Override
    public void setRoles(Role1 roles) {
        super.setRoles(Role1.ADMIN);
    }
}
