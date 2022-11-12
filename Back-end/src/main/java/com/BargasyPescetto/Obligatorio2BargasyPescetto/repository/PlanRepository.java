package com.BargasyPescetto.Obligatorio2BargasyPescetto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BargasyPescetto.Obligatorio2BargasyPescetto.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer> {
    
}
