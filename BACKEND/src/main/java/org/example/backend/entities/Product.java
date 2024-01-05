package org.example.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;
    @NotNull
    private String nameProduct;

    private Double priceProduct;

    @ManyToOne
    private Restau restau;

    @OneToMany(mappedBy = "produit")
    private List<LigneCommande> lignesCommande;



   @ManyToOne
    private Category category;


}
