package org.example.backend.services;

import org.example.backend.entities.Restau;

import java.util.List;

public interface RestauService {
    Restau saveRestau(Restau restau);

    Restau updateRestau(Restau restau);
    Restau getRestauById(Long id);
    List<Restau> getAllRestaurants();
    void deleteRestauById(Long id);
    void deleteAllRestaus();








}
