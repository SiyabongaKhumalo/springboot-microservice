package com.spring.microservices.product.dto;

import lombok.*;


@Builder
public class ProductRequestdto {


    private int id;
    private String name;
    private String Description;
    private Double price;

    public ProductRequestdto(int id, String name, String description, Double price) {
        this.id = id;
        this.name = name;
        Description = description;
        this.price = price;
    }

    public ProductRequestdto(String name, String description, Double price) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }




}
