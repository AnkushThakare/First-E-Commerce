package com.example.firstecommerce.Service;

import com.example.firstecommerce.Module.Product;
import com.example.firstecommerce.dto.CreateProductDto;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getSingleProduct(long id);

    void CreateProduct(CreateProductDto createProductDto);

}
