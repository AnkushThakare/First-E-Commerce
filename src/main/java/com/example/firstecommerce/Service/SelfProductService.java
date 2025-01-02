package com.example.firstecommerce.Service;

import com.example.firstecommerce.Module.Category;
import com.example.firstecommerce.Module.Product;
import com.example.firstecommerce.Repositery.CategoryRepository;
import com.example.firstecommerce.Repositery.ProductRepository;
import com.example.firstecommerce.exception.ProductNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("SelfProductService")
public class SelfProductService implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        // Return all products.
        return productRepository.findAll();
    }

    @Override
    public Product getSingleProduct(long id) throws ProductNotFoundException {
        // Find the product by ID.
        Optional<Product> product = productRepository.findById(id);
        // Throw exception if not found.
        return product.orElseThrow(() -> new ProductNotFoundException("Product with ID " + id + " not found."));
    }

    @Override
    public Product createProduct(String title, String description, String image, Category category, double price) {
        // Create a new product instance.
        Product newProduct = new Product();

        newProduct.setTitle(title);
        newProduct.setDescription(description);
        newProduct.setImageUrl(image);
        newProduct.setPrice(price);

        // Look for the category in the database by its title.
        Category categoryFromDb = categoryRepository.findByTitle(category.getTitle());

        if (categoryFromDb != null) {
            // Set the existing category from the database.
            newProduct.setCategory(categoryFromDb);
        } else {
            // If the category doesn't exist, set the provided category directly.
            newProduct.setCategory(category);
        }

        // Save the product to the repository.
        return productRepository.save(newProduct);
    }
}
