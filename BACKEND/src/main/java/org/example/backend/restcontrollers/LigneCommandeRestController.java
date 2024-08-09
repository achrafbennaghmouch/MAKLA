package org.example.backend.restcontrollers;

import org.example.backend.entities.LigneCommande;
import org.example.backend.services.LigneCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ligne-commandes")
public class LigneCommandeRestController {
    @Autowired
    private LigneCommandeService ligneCommandeService;

    @GetMapping
    public ResponseEntity<List<LigneCommande>> getAllLigneCommandes() {
        return ResponseEntity.ok(ligneCommandeService.getAllLigneCommandes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LigneCommande> getLigneCommandeById(@PathVariable Long id) {
        return ResponseEntity.ok(ligneCommandeService.getLigneCommandeById(id));
    }

    @PostMapping
    public ResponseEntity<LigneCommande> createLigneCommande(@RequestBody LigneCommande ligneCommande) {
        return ResponseEntity.ok(ligneCommandeService.createLigneCommande(ligneCommande));
    }

    @PutMapping("/{id}")
    public ResponseEntity<LigneCommande> updateLigneCommande(@PathVariable Long id, @RequestBody LigneCommande ligneCommande) {
        return ResponseEntity.ok(ligneCommandeService.updateLigneCommande(ligneCommande));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLigneCommande(@PathVariable Long id) {
        ligneCommandeService.deleteLigneCommande(id);
        return ResponseEntity.ok().build();
    }
}