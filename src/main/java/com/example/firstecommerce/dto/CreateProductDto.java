package com.example.firstecommerce.dto;

public class CreateProductDto {
     private String title;
     private String description;
     private double price;
     private String image;
     private String category;


     public String getTitle() {
          return this.title;
     }

     public String getDescription() {
          return this.description;
     }

     public double getPrice() {
          return this.price;
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

     public void setDescription(String description) {
          this.description = description;
     }

     public void setPrice(double price) {
          this.price = price;
     }

     public void setImage(String image) {
          this.image = image;
     }

     public void setCategory(String category) {
          this.category = category;
     }
}
