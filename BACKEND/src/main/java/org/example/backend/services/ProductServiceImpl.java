package org.example.backend.services;

import org.example.backend.entities.Category;
import org.example.backend.entities.Product;
import org.example.backend.entities.Restau;
import org.example.backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void deleteAllProducts() {
        productRepository.deleteAll();
    }

    @Override
    public List<Product> findAllProductsByPrice(double priceProduct) {
        return productRepository.findAllProductsByPrice(1000.00);
    }


    @Override
    public List<Product> findAllProductsByCategory(Category category) {
        return productRepository.findAllProductsByCategory(category);
    }

    @Override
    public List<Product> findAllProductsByRestau(Restau restau) {
        return productRepository.findAllProductsByRestau(restau);
    }

    @Override
    public List<Product> findAllProductsByIdCategory(Long idCategory) {
        return productRepository.findByCategoryIdCategory(idCategory);
    }

    @Override
    public List<Product> findAllProductsByNameSort() {
        return productRepository.findAllProductsByNameSort();
    }

    @Override
    public Page<Product> getAllProductsByPage(int page, int size) {
        return productRepository.findAll(PageRequest.of(page, size));
    }
}
