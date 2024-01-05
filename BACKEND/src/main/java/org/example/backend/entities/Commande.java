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
    private long PrixTotal;
    private long Quantite_commande;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "commande")
    private List<LigneCommande> lignesCommande;



}
