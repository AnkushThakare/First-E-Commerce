package com.example.firstecommerce.Controller;

import com.example.firstecommerce.Module.Product;
import com.example.firstecommerce.Repositery.ProductRepository;
import com.example.firstecommerce.Service.ProductService;
import com.example.firstecommerce.dto.CreateProductDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/products")




public class ProductController {




    private ProductService productService;
    public ProductController(@Qualifier("SelfProductService") ProductService productService) {
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
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@Valid @RequestBody CreateProductDto createProductDto) {
        return productService.createProduct(
                createProductDto.getTitle(),
                createProductDto.getDescription(),
                createProductDto.getImage(),  // Ensure image is present in CreateProductDto
                createProductDto.getCategory(),
                createProductDto.getPrice()  // Ensure price is present in CreateProductDto
        );
    }
}






