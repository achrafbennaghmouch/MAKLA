package org.example.backend.services;

import org.example.backend.entities.Category;
import org.example.backend.entities.Product;
import org.example.backend.entities.Restau;
import org.springframework.data.domain.Page;

import java.util.List;

public interface RestauService {
    Restau saveRestau(Restau restau);

    Restau updateRestau(Restau restau);
    Restau getRestauById(Long id);
    List<Restau> getAllRestaurants();
    void deleteRestauById(Long id);
    void deleteAllRestaus();
    void addProduct(Product product);







}
