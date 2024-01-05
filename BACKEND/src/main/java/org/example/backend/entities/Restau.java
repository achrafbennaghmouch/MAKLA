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

public class Restau extends Compte {

    private Long restauId;
    private String nameRestau;
    @OneToMany(mappedBy = "restau")
  //  @JsonIgnore
    private List<Product> products;
   @OneToOne
    private Adresse adresseRestau;

    @Override
    public void setRoles(Role1 roles) {
        super.setRoles(Role1.RESTAU);
    }
}
