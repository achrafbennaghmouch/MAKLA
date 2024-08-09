package org.example.backend.restcontrollers;

import jakarta.validation.Valid;
import org.example.backend.entities.Commande;
import org.example.backend.entities.Livreur;
import org.example.backend.services.LivreurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livreurs")
public class LivreurRestController {

    @Autowired
    private LivreurService livreurService;

    @GetMapping
    public ResponseEntity<List<Livreur>> getAllLivreurs() {
        List<Livreur> livreurs = livreurService.findAll();
        return new ResponseEntity<>(livreurs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livreur> getLivreurById(@PathVariable Long id) {
        Livreur livreur = livreurService.findById(id);
        if (livreur != null) {
            return new ResponseEntity<>(livreur, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping("/addlivreur")
    public ResponseEntity<Livreur> createLivreur(@Valid @RequestBody Livreur livreur) {
        Livreur newLivreur = livreurService.save(livreur);
        return new ResponseEntity<>(newLivreur, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livreur> updateLivreur(@PathVariable Long id, @Valid @RequestBody Livreur updatedLivreur) {
        Livreur livreur = livreurService.findById(id);
        if (livreur != null) {
            updatedLivreur.setId(id);
            livreurService.update(updatedLivreur);
            return new ResponseEntity<>(updatedLivreur, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteLivreur(@PathVariable Long id) {
        livreurService.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }


}