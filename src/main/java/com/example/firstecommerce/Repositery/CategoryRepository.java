package com.example.firstecommerce.Repositery;

import com.example.firstecommerce.Module.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByTitle(String Title);
}
