package com.example.hibernatetest.controller;


import com.example.hibernatetest.entity.LighteningDeal;
import com.example.hibernatetest.entity.Product;
import com.example.hibernatetest.service.LighteningDealService;
import com.example.hibernatetest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class ShoppingController {

    @Autowired
    private ProductService productService;

    @Autowired
    private LighteningDealService lighteningDealService;


    @GetMapping("/lighteningDeal/{id}/{userId}")
    public Product buyProduct(@PathVariable("id") int id , @PathVariable("userId") int useriD) {

        LighteningDeal lighteningDeal =  lighteningDealService.getDealById(id);

        if(lighteningDeal.getAvailableQuantity()>0 && !lighteningDeal.getUserId().contains(useriD) && lighteningDeal.getEndTime().isAfter(LocalDateTime.now()) && lighteningDeal.getStartTime().isBefore(LocalDateTime.now())){
            lighteningDeal.getUserId().add(useriD);
            lighteningDeal.setAvailableQuantity(lighteningDeal.getAvailableQuantity()-1);
            lighteningDealService.saveLighteningDeal(lighteningDeal);
            Product p = productService.getProductById(lighteningDeal.getProductId());
            p.setAvailableQuantity(p.getAvailableQuantity()-1);
            productService.saveProduct(p);
            System.out.println("Bought "+lighteningDeal.getProductId()+" by user "+useriD);
            return p;
        }
        System.out.println("Cannot buy the product");
        return null;
    }

}
