package org.example.backend.restcontrollers;

import org.example.backend.entities.Client;
import org.example.backend.entities.Commande;
import org.example.backend.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientRestController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/saveClient")
    public Client saveClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }
}