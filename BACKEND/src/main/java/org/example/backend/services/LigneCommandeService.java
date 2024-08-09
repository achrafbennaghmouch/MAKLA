package org.example.backend.services;

import org.example.backend.entities.LigneCommande;
import org.example.backend.repositories.LigneCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneCommandeService {
    @Autowired
    private LigneCommandeRepository ligneCommandeRepository;

    public List<LigneCommande> getAllLigneCommandes() {
        return ligneCommandeRepository.findAll();
    }

    public LigneCommande getLigneCommandeById(Long id) {
        return ligneCommandeRepository.findById(id).orElse(null);
    }

    public LigneCommande createLigneCommande(LigneCommande ligneCommande) {
        return ligneCommandeRepository.save(ligneCommande);
    }

    public LigneCommande updateLigneCommande(LigneCommande ligneCommande) {
        return ligneCommandeRepository.save(ligneCommande);
    }

    public void deleteLigneCommande(Long id) {
        ligneCommandeRepository.deleteById(id);
    }
}