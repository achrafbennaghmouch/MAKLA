package org.example.backend.services;
import org.example.backend.entities.Category;
import org.example.backend.entities.Product;
import org.example.backend.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(long id, Category category) {
        Category existingCategory = categoryRepository.findById(id).orElse(null);
        if (existingCategory != null) {
            existingCategory.setNom(category.getNom());
            existingCategory.setDescription(category.getDescription());
            return categoryRepository.save(existingCategory);
        } else {
            return null;
        }
    }

    public void deleteCategory(long id) {
        categoryRepository.deleteById(id);
    }
    public List<Product> getAllProductsFromCategory(long id) {
        Category category = getCategoryById(id);
        return category.getProducts();
    }
}
