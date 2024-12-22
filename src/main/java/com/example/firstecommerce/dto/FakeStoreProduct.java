package com.example.firstecommerce.dto;

import com.example.firstecommerce.Module.Products;
import com.example.firstecommerce.Module.Category;


public class FakeStoreProduct {
    private String title;
    private double Price;
    private String description;
    private String image;
    private String category;

    public Products toProduct() {
        Products products = new Products();
        products.setTitle(title);

        products.setPrice(Price);

        Category category1 = new Category();
        category1.setTitle(category);
        products.setCategory(category1);

        products.setImageUrl(image);
        return products;


    }


    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.Price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getImage() {
        return this.image;
    }

    public String getCategory() {
        return this.category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
