package org.example.backend.repositories;


import org.example.backend.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserRepo extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByUsername(String username);
    Optional<UserEntity> findByEmail(String email);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
    Boolean existsByPassword(String password);


}