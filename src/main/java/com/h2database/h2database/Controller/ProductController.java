package com.h2database.h2database.Controller;


import com.h2database.h2database.Model.Product;
import com.h2database.h2database.Service.ProductService;
import com.h2database.h2database.dto.productdto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping("/addproduct")
    @ResponseStatus(HttpStatus.CREATED)
    public Product createUser(@RequestBody Product user){
        return productService.createUser(user);
    }

    @GetMapping("/getproduct")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Product> getAllUser(@RequestBody productdto productdto){
        return productService.getAllUser();
    }
    @PutMapping("/updateproduct")
    @ResponseStatus(HttpStatus.OK)
    public Product updateUser(@RequestBody Product user){
        return productService.updateUser(user);
    }
    @GetMapping("/getproduct/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Product findUserById(@PathVariable int id){
        return productService.getUserByID(id);
    }
    @DeleteMapping("/deleteproduct")
    @ResponseStatus(HttpStatus.OK)
    public String deleteUser(@PathVariable int id){
        return productService.deleteUser(id);

    }


}
