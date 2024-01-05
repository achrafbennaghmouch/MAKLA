package org.example.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Compte {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long compteId;
    @Column(unique=true)
    private String email;
    private String username;
    private String password;
   /* @ManyToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="user_role",joinColumns = @JoinColumn(name="userId") ,
            inverseJoinColumns = @JoinColumn(name="roleId"))*/

    @Enumerated(EnumType.STRING)
    private Role1 roles;
}
