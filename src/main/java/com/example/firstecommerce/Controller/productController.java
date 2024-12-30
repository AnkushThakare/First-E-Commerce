package com.example.firstecommerce.Controller;

import com.example.firstecommerce.Module.Product;
import com.example.firstecommerce.Service.ProductService;
import com.example.firstecommerce.dto.CreateProductDto;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/products")




public class productController {



    private ProductService productService;
    public productController(@Qualifier("SelfProductService") ProductService productService) {
        this.productService = productService;

    }

    @GetMapping("/")
    public List<Product> getAllProducts() {
        // Return the list of products (mock data for now)
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable ("id")Long id) {
        // Return a single product based on ID (mock data for now)
        return productService.getSingleProduct(id);
    }
    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public void CreateProduct(@RequestBody CreateProductDto createProductDto) {
        productService.CreateProduct(createProductDto);



    }
}