package com.example.firstecommerce.dto;

import com.example.firstecommerce.Module.Category;
import lombok.Getter;
import org.aspectj.bridge.IMessage;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;


public class CreateProductDto {
     private String title;

     private String description;
     private double price;

     private String image;
     private String category;

       @NotBlank(message="title cannot blank")
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
