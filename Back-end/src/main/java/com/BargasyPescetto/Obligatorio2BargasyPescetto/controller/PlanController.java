package com.BargasyPescetto.Obligatorio2BargasyPescetto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BargasyPescetto.Obligatorio2BargasyPescetto.entity.Plan;
import com.BargasyPescetto.Obligatorio2BargasyPescetto.service.PlanService;

@RestController
@RequestMapping("/plan")
public class PlanController {
    @Autowired 
    private PlanService planService;

    @PostMapping("/add")
    public String add(@RequestBody Plan plan){
        planService.guardarPlan(plan);
        return "Nuevo plan añadido exitosamente";
    }

    @GetMapping("/list")
    public List<Plan> list(){
        return planService.listarPlan();
    }
}
