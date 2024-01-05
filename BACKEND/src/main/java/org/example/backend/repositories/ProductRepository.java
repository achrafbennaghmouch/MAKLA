package org.example.backend.repositories;

import org.example.backend.entities.Category;
import org.example.backend.entities.Product;
import org.example.backend.entities.Restau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

@RepositoryRestResource(path = "rest")
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select product from Product product where product.priceProduct >?1")
    List<Product> findAllProductsByPrice(double priceProduct);



    @Query("select product from Product product where product.category =?1")
    List<Product> findAllProductsByCategory(Category category);
    @Query("select product from Product product where product.restau =?1")
    List<Product> findAllProductsByRestau(Restau restau);

    @Query("select product from Product product order by product.nameProduct")
    List<Product> findAllProductsByNameSort();

    List<Product> findByCategoryIdCategory(Long idCatgory);

}
