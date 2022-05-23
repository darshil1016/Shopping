package com.example.hibernatetest.service;

import com.example.hibernatetest.entity.Admin;
import com.example.hibernatetest.entity.Product;
import com.example.hibernatetest.repository.AdminRepository;
import com.example.hibernatetest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private AdminRepository adminRepository;

    public Product saveProduct(Product product) {

        return productRepository.save(product);

    }

    /*public void updateAdminProductList(Product p) {

        Optional<Admin> admin = adminRepository.findById(p.getId());
        admin.get().getProductList().se;
        adminRepository.save(admin.get());

    }*/

    public Product getProductById(int productId) {

        return productRepository.findById(productId).get();

    }
}
