package org.example.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Livreur extends Compte{

    private String prenom;
    private String nom;
   @OneToOne
   private Adresse zoneLivraison;
    private Boolean dispo;

    @Override
    public void setRoles(Role1 roles) {
        super.setRoles(Role1.LIVREUR);
    }
}
