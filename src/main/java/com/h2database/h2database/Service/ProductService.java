package com.h2database.h2database.Service;


import com.h2database.h2database.Model.Product;
import com.h2database.h2database.Repo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo userRepo) {
        this.productRepo = userRepo;
    }

    public Product createUser(Product user){
        return productRepo.save(user);
    }

    public List<Product> getAllUser(){
        return productRepo.findAll();
    }

    public Product getUserByID(int id) {
        return productRepo.findById(id).orElse(null);
    }
    public Product updateUser(Product user){
        return productRepo.save(user);
    }
    public String deleteUser(int id) {
        if (productRepo.existsById(id)) {
            productRepo.deleteById(id);
        }
        return id + " product deleted";
    }
}
