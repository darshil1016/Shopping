package com.example.hibernatetest.repository;

import com.example.hibernatetest.entity.LighteningDeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LighteningDealRepository extends JpaRepository<LighteningDeal,Integer> {
}
