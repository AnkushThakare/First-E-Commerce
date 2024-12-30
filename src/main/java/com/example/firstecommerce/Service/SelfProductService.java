package com.example.firstecommerce.Service;

import com.example.firstecommerce.Module.Product;
import com.example.firstecommerce.Repositery.ProductRepository;
import com.example.firstecommerce.dto.CreateProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductService")
public class SelfProductService implements ProductService {

    private final ProductRepository productRepository;

    // Constructor to inject the productRepository dependency
    public SelfProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getSingleProduct(long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public List<Product> getAllProducts() {
        // Retrieve and return all products from the repository
        return productRepository.findAll();
    }
    @Override
    public void CreateProduct(CreateProductDto createProductDto) {
        // Logic for creating a product
        Product newProduct = new Product();

        newProduct.setPrice(createProductDto.getPrice());
        newProduct.setDescription(createProductDto.getDescription());
        // Save the product
        productRepository.save(newProduct);
    // Implement other methods if necessary (e.g., CreateProduct)

}   }
