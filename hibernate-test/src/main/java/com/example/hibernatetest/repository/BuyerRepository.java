package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer,Integer> {



}
