package com.example.firstecommerce.Service;

import com.example.firstecommerce.Module.Products;
import com.example.firstecommerce.dto.CreateProductDto;
import com.example.firstecommerce.dto.FakeStoreProduct;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class FakeStoreService implements  ProductService {
    private RestTemplate restTemplate ;
     public FakeStoreService(RestTemplate restTemplate) {
         this.restTemplate = restTemplate;

     }

    @Override
    public List<Products> getAllProducts() {
        return List.of();
    }

    @Override
    public Products  getSingleProduct(long id) {
        FakeStoreProduct fakeStoreProduct = restTemplate.getForObject("https://fakestoreapi.com/products/1"+id, FakeStoreProduct.class);
        return fakeStoreProduct.toProduct();
    }

    @Override
    public void CreateProduct(CreateProductDto createProductDto) {

    }
}
