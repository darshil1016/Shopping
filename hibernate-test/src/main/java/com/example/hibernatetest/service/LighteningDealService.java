package com.example.hibernatetest.service;

import com.example.hibernatetest.entity.LighteningDeal;
import com.example.hibernatetest.repository.LighteningDealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LighteningDealService {

    @Autowired
    private LighteningDealRepository lighteningDealRepository;


    public LighteningDeal saveLighteningDeal(LighteningDeal lighteningDeal) {

        return lighteningDealRepository.save(lighteningDeal);

    }


    public LighteningDeal getDealById(int id) {

        return lighteningDealRepository.findById(id).get();

    }

    public LighteningDeal updateEndTime(int productId, LocalDateTime endTime) {

        LighteningDeal lighteningDeal = lighteningDealRepository.findById(productId).get();
        lighteningDeal.setEndTime(endTime);
        return lighteningDealRepository.save(lighteningDeal);


    }

    public LighteningDeal updateQuantity(int productId, int quantity) {

        LighteningDeal lighteningDeal = lighteningDealRepository.findById(productId).get();
        lighteningDeal.setAvailableQuantity(quantity);
        return lighteningDealRepository.save(lighteningDeal);


    }
}
