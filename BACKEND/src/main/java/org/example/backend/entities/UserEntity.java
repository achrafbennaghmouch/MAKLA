package org.example.backend.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;






@Entity
@Data
@Getter
@Setter
@Table(name = "users",uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email")
})

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public UserEntity(String username, String firstname, String lastname, String email, String password, String numero) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.numero = numero;
    }
    public UserEntity() {
    }



    private String username;


    private String firstname;


    private String lastname;


    @Email
    private String email;


    private String password;

    private String numero;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();
    @OneToMany(mappedBy = "user")
    private List<Commande> commandes;
    public UserEntity(String username, String email, String encode) {
        this.username=username;
        this.email=email;
        this.password=encode ;
    }
}
