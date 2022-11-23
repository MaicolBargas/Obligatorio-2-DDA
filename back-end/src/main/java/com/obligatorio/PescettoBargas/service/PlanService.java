package com.obligatorio.PescettoBargas.service;

import com.obligatorio.PescettoBargas.model.Plan;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface PlanService {
    public Plan guardarPlan(Plan plan);
    public List<Plan> listarPlan();
    public void borrarPlan(int id);
    public Plan buscarPlan(int id);
    public Plan modificarPlan(Plan plan);
}
