package com.h2database.h2database.Repo;

import com.h2database.h2database.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Object> findAllById(Integer id);
}
