package org.example.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@DiscriminatorValue("CLIENT")
public class Client extends Compte {


    private String prenom;
    private String nom;
    private String numTel;

    @OneToOne
    private Adresse adresse;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;
    @Override
    public void setRoles(Role1 roles) {
        super.setRoles(Role1.CLIENT);
    }


}
