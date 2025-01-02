package com.example.firstecommerce.Service;

import com.example.firstecommerce.Module.Category;
import com.example.firstecommerce.Module.Product;
import com.example.firstecommerce.exception.ProductNotFoundException;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getSingleProduct(long id) throws ProductNotFoundException;


   Product createProduct(String Title, String description, String image, Category category, double price);


    }

