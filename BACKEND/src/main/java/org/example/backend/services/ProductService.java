package org.example.backend.services;

import org.example.backend.entities.Category;
import org.example.backend.entities.Product;
import org.example.backend.entities.Restau;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService
{
    Product saveProduct(Product product);
    Product updateProduct(Product product);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    void deleteProductById(Long id);
    void deleteAllProducts();

    List<Product> findAllProductsByPrice(double priceProduct);

    List<Product> findAllProductsByCategory(Category category);
    List<Product> findAllProductsByRestau(Restau restau);

    List<Product> findAllProductsByIdCategory(Long idCategory);
    List<Product> findAllProductsByNameSort();

    Page<Product> getAllProductsByPage(int page, int size);

}
