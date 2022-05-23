package com.example.hibernatetest.controller;


import com.example.hibernatetest.entity.LighteningDeal;
import com.example.hibernatetest.service.LighteningDealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class LighteningDealController {

    @Autowired
    private LighteningDealService lighteningDealService;

    @PostMapping("/lighteningDeal")
    public LighteningDeal createLighteningDeal(@RequestBody LighteningDeal lighteningDeal){

        return lighteningDealService.saveLighteningDeal(lighteningDeal);

    }

    @PutMapping("/lighteningDeal/{productId}/time/{time}")
    public LighteningDeal updateEndTime(@PathVariable("productId") int productId, @PathVariable LocalDateTime endTime){


        return lighteningDealService.updateEndTime(productId,endTime);

    }

    @PutMapping("/lighteningDeal/{productId}/quantity/{quantity}")
    public LighteningDeal updateQuantity(@PathVariable("productId") int productId, @PathVariable int quantity){


        return lighteningDealService.updateQuantity(productId,quantity);

    }

}
