package com.BargasyPescetto.Obligatorio2BargasyPescetto.service;

import java.util.List;

import com.BargasyPescetto.Obligatorio2BargasyPescetto.entity.Plan;

public interface PlanService {
    public Plan guardarPlan(Plan plan);
    public List<Plan> listarPlan();
}
