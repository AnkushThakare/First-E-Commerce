package com.example.firstecommerce.Controller;

import com.example.firstecommerce.Module.Product;
import com.example.firstecommerce.Service.ProductService;
import com.example.firstecommerce.dto.CreateProductDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/products")




public class productController {


    private ProductService productService;
    public productController(ProductService productService) {
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
    @PostMapping("/prducts")
    public void CreateProduct(CreateProductDto createProductDto) {
        productService.CreateProduct(createProductDto);



    }
}