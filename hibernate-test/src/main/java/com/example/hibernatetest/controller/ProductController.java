package com.example.hibernatetest.controller;


import com.example.hibernatetest.entity.Product;
import com.example.hibernatetest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/buyer")
    public Product createProduct(@RequestBody Product product){
        Product p = productService.saveProduct(product);
        //productService.updateAdminProductList(p);
        return p;
    }


}
