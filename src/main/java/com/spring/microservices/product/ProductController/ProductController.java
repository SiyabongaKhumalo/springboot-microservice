package com.spring.microservices.product.ProductController;

import com.spring.microservices.product.ProductRepo.ProductRepo;
import com.spring.microservices.product.dto.ProductRequestdto;
import com.spring.microservices.product.dao.Product;
import com.spring.microservices.product.ProductService.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody ProductRequestdto productRequestdto) {
        return productService.createProduct(productRequestdto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductRequestdto> getAllProduct(){
        return productService.getAllProduct();
    }

}
