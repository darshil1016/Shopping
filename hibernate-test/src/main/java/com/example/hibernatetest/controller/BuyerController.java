package com.example.hibernatetest.controller;

import com.example.hibernatetest.entity.Admin;
import com.example.hibernatetest.entity.Buyer;
import com.example.hibernatetest.service.AdminService;
import com.example.hibernatetest.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @PostMapping("/buyer")
    public Buyer createAdmin(@RequestBody Buyer buyer){
        return buyerService.createBuyer(buyer);
    }

}
