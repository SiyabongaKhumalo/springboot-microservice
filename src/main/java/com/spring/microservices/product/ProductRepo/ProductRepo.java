package com.spring.microservices.product.ProductRepo;

import com.spring.microservices.product.dao.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
