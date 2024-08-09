package org.example.backend.restcontrollers;

import org.example.backend.entities.*;
import org.example.backend.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commandes")
public class CommandeRestController {
    @Autowired
    private CommandeService commandeService;

    @GetMapping()
    public List<Commande> getAllCommandes() {
        return commandeService.getAllCommandes();
    }

    @GetMapping("/{id}")
    public Commande getCommandeById(@PathVariable long id) {
        return commandeService.getCommandeById(id);
    }

    @PostMapping("/add")
    public Commande addCommande(@RequestBody Commande commande) {
        return commandeService.addCommande(commande);
    }

    @PutMapping("/{id}")
    public Commande updateCommande(@PathVariable long id, @RequestBody Commande commande) {
        return commandeService.updateCommande(id, commande);
    }

    @DeleteMapping("/{id}")
    public void deleteCommande(@PathVariable long id) {
        commandeService.deleteCommande(id);
    }

    @GetMapping("/{id}/lignescommandes")
    public List<LigneCommande> getAllLignesCommandesFromCommande(@PathVariable long id) {
        return commandeService.getAllLignesCommandesFromCommande(id);
    }
    @PostMapping("/addcmdclient/{clientId}")
    public Commande ajouterCommandeClient(@PathVariable("clientId") long clientId, @RequestBody Commande commande) {
        UserEntity user = new UserEntity();
        user.setId(clientId);
        return commandeService.ajouterCommandeClient(user, commande);
    }


}