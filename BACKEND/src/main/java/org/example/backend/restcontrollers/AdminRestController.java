package org.example.backend.restcontrollers;

import org.example.backend.entities.Admin;
import org.example.backend.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admins")
public class AdminRestController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/saveAdmin")
    public Admin saveAdmin(@RequestBody Admin admin) {
        return adminService.saveAdmin(admin);
    }

    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable Long id) {
        return adminService.getAdminById(id);
    }
}