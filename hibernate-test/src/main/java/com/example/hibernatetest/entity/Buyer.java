package com.example.hibernatetest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private int phoneNumber;


    // address , ...




}
/*

User
Admin
Buyer

Products (id , Name , Des , availableQuan , isLightDeal )

LightDeal(StartTime ,endtime , availQuan)
*/
