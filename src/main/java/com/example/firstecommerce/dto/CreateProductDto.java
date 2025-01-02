package com.example.firstecommerce.dto;

import com.example.firstecommerce.Module.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class CreateProductDto {
    private String title;
    private String description;
    private double price;
    private String image;

    // Change category to Category type if it's a class
    private Category category;

    @NotBlank(message="title cannot be blank")
    public String getTitle() {
        return this.title;
    }

    @Positive
    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getImage() {
        return this.image;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
