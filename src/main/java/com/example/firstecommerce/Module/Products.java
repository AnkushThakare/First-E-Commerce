package com.example.firstecommerce.Module;


public class Products {
    private int id;
    private String title;
    private double price;
    private Category category;
    private String ImageUrl;


    public Products(int id, String title, double price, Category category, String ImageUrl) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.category = category;
        this.ImageUrl = ImageUrl;
    }

    public Products() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public Category getCategory() {
        return this.category;
    }

    public String getImageUrl() {
        return this.ImageUrl;
    }
}
