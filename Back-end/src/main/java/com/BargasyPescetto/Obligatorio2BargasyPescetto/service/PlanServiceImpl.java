package com.BargasyPescetto.Obligatorio2BargasyPescetto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BargasyPescetto.Obligatorio2BargasyPescetto.entity.Plan;
import com.BargasyPescetto.Obligatorio2BargasyPescetto.repository.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepository planRepository;

    @Override
    public Plan guardarPlan(Plan plan) {
        return planRepository.save(plan);
    }

    @Override
    public List<Plan> listarPlan() {
        return planRepository.findAll();
    }


    
}
