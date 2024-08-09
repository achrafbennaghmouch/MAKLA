package org.example.backend.repositories;

import org.example.backend.entities.Restau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauRepository extends JpaRepository<Restau, Long> {
}
