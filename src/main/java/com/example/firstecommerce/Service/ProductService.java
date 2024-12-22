package com.example.firstecommerce.Service;

import com.example.firstecommerce.Module.Products;
import com.example.firstecommerce.dto.CreateProductDto;

import java.util.List;

public interface ProductService {

    List<Products> getAllProducts();
    Products getSingleProduct(long id);

     void CreateProduct(CreateProductDto createProductDto);

}
