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
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commande_id", nullable = false)
    private long id;
    private int prix_total;
    private int Quantite_commande;

    public Commande(int prix_total, int quantite_commande) {
        this.prix_total = prix_total;
        Quantite_commande = quantite_commande;
    }

    @ManyToOne
    private UserEntity user;

    @OneToMany(mappedBy = "commande")
    private List<LigneCommande> lignesCommande;



}
