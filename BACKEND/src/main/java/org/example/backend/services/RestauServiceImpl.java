package org.example.backend.services;

import org.example.backend.entities.Restau;
import org.example.backend.repositories.RestauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestauServiceImpl implements RestauService{
    @Autowired
    RestauRepository restauRepository;
    @Override
    public Restau saveRestau(Restau restau) {
        return restauRepository.save(restau);
    }

    @Override
    public Restau updateRestau(Restau restau) {
        return restauRepository.save(restau);
    }

    @Override
    public Restau getRestauById(Long id) {
        return restauRepository.findById(id).get();
    }

    @Override
    public List<Restau> getAllRestaurants() {
        return restauRepository.findAll();
    }

    @Override
    public void deleteRestauById(Long id) {
        restauRepository.deleteById(id);
    }

    @Override
    public void deleteAllRestaus() {
        restauRepository.deleteAll();
    }


}
