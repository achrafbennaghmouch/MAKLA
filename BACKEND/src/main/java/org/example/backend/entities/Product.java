package org.example.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.example.backend.entities.LigneCommande;
import org.example.backend.entities.Restau;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;
    private String nameProduct;

    private Double priceProduct;

    @ManyToOne
    @JsonIgnore
    private Restau restau;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<LigneCommande> lignesCommande;



    @ManyToOne
    @JsonIgnore
    private Category category;


}
