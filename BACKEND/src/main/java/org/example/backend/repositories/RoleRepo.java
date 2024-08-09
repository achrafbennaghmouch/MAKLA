package org.example.backend.repositories;

import org.example.backend.entities.ERole;
import org.example.backend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface RoleRepo extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(ERole name);

}
