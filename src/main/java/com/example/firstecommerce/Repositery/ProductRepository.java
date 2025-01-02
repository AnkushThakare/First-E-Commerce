package com.example.firstecommerce.Repositery;

import com.example.firstecommerce.Module.Category;
import com.example.firstecommerce.Module.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
   @Override
   List<Product> findAll();
   Optional<Product> findById(Long id);
   Product save(Product p);
    // JpaRepository provides methods like findById, save, delete, etc.

}

