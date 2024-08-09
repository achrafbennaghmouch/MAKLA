package org.example.backend.services;

import org.example.backend.entities.Product;
import org.example.backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        return productRepository.findById(id).map(existingProduct -> {
            existingProduct.setNameProduct(product.getNameProduct());
            existingProduct.setPriceProduct(product.getPriceProduct());
            existingProduct.setRestau(product.getRestau());
            existingProduct.setCategory(product.getCategory());
            return productRepository.save(existingProduct);
        }).orElse(null);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
