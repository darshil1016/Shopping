package com.example.hibernatetest.service;

import com.example.hibernatetest.entity.Admin;
import com.example.hibernatetest.entity.Buyer;
import com.example.hibernatetest.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerService {

    @Autowired
    private BuyerRepository buyerRepository;

    public Buyer createBuyer(Buyer buyer) {
        return buyerRepository.save(buyer);
    }
}
