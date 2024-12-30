package com.example.firstecommerce.Repositery;

import com.example.firstecommerce.Module.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // JpaRepository provides methods like findById, save, delete, etc.
}

