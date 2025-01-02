package com.example.firstecommerce.Service;

import com.example.firstecommerce.Module.Category;
import com.example.firstecommerce.Module.Product;
import com.example.firstecommerce.dto.CreateProductDto;
import com.example.firstecommerce.dto.FakeStoreProduct;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("FakeStoreService")
public class FakeStoreService implements ProductService {

    private final RestTemplate restTemplate;

    public FakeStoreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Product> getAllProducts() {
        // Assuming you want to return an empty list for now
        return List.of();
    }

    @Override
    public Product getSingleProduct(long id) {
        // Corrected URL with the id concatenated properly
        FakeStoreProduct fakeStoreProduct = restTemplate.getForObject(
                "https://fakestoreapi.com/products/" + id, FakeStoreProduct.class);
        // Convert the FakeStoreProduct DTO to a Product entity
        if (fakeStoreProduct != null) {
            return fakeStoreProduct.toProduct(); // Assuming toProduct() method exists
        }
        return null; // Handle case when the product is not found
    }


    public void CreateProduct(CreateProductDto createProductDto) {
        // Implement the logic for creating a product here (if necessary)
    }

    @Override
    public Product createProduct(String title, String description, String image, Category category, double price) {
        // Mock implementation for creating a product, ideally you'd save it in a database
        Product newProduct = new Product();
        newProduct.setTitle(title);
        newProduct.setDescription(description);
        newProduct.setImageUrl(image);
        newProduct.setCategory(category);
        newProduct.setPrice(price);

        // You can save this newProduct to the database or return it for now
        return newProduct;
    }
}
