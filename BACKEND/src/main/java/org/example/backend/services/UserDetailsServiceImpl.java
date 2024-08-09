package org.example.backend.services;

import jakarta.transaction.Transactional;
import org.example.backend.entities.UserEntity;
import org.example.backend.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepo userRepository;
    @Override

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("trying fetch");
        UserEntity user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return UserDetailsImpl.build(user);
    }
}