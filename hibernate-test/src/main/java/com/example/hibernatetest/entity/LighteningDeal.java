package com.example.hibernatetest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LighteningDeal {

    @Id

    private int productId;
    //private boolean isLighteningDeal;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int availableQuantity;

    //list of users who have claimed the deal
    private List<Integer> userId;

}
