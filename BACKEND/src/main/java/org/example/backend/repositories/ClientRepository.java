package org.example.backend.repositories;

import org.example.backend.entities.Client;
import org.example.backend.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}