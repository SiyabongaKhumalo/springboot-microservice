package com.spring.microservices.product.ProductService;


import com.spring.microservices.product.dto.ProductRequestdto;
import com.spring.microservices.product.dao.Product;
import com.spring.microservices.product.ProductRepo.ProductRepo;
import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;


@Setter
@Getter
@Service
public class ProductService {


    private static final Logger log = LoggerFactory.getLogger(ProductService.class);

    private final ProductRepo productRepo;
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product createProduct(ProductRequestdto productRequestdto) {
        Product product = Product.builder()
                .name(productRequestdto.getName())
                .description(productRequestdto.getDescription())
                .price(productRequestdto.getPrice())
                .build();
        productRepo.save(product);
        log.info("product saved successfull");
        return product;

    }
    public List<ProductRequestdto> getAllProduct() {
        return productRepo.findAll()
                .stream()
                .map(Product -> new ProductRequestdto(Product.getName(), Product.getDescription(), Product.getPrice()))
                .toList();
    }

}
