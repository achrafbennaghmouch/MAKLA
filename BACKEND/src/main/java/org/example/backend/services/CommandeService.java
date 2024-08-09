package org.example.backend.services;

import org.example.backend.entities.*;
import org.example.backend.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private CommandeRepository commandeRepository;

    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    public Commande getCommandeById(long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    public Commande addCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    public Commande updateCommande(long id, Commande commande) {
        commande.setId(id);
        return commandeRepository.save(commande);
    }

    public void deleteCommande(long id) {
        commandeRepository.deleteById(id);
    }

    public List<LigneCommande> getAllLignesCommandesFromCommande(long id) {
        Commande commande = getCommandeById(id);
        return commande.getLignesCommande();
    }
    public Commande ajouterCommandeClient(UserEntity client, Commande commande) {
        commande.setUser(client);
        return commandeRepository.save(commande);
    }
}