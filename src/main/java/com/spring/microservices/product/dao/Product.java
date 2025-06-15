package com.spring.microservices.product.dao;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Table(name="product_table")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String name;
    private String description;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }




    public Product(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
         private int id;
         private String name;
         private String description;
         private Double price;

        public Builder() {
        }

        public Builder id(int id) {
             this.id = id;
             return this;
         }

         public Builder name(String name) {
             this.name = name;
             return this;
         }

         public Builder description(String description) {
             this.description = description;
             return this;
         }

         public Builder price(Double price) {
             this.price = price;
             return this;
         }

         public Product build() {
             return new Product(name, description, price);
         }
     }
}
