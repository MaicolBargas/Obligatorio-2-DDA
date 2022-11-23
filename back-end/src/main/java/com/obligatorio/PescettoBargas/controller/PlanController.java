package com.obligatorio.PescettoBargas.controller;


import com.obligatorio.PescettoBargas.model.Plan;
import com.obligatorio.PescettoBargas.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plan")
public class PlanController {

    @Autowired
    private PlanService planService;

    @PostMapping("/add")
    public String add(@RequestBody Plan plan)
    {
        planService.guardarPlan(plan);
        return "Plan ingresado con èxito";
    }

    @GetMapping("/list")
    public List<Plan> list(){
        return planService.listarPlan();
    }

     @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        planService.borrarPlan(id);
        return "Plan borrado exitosamente";
     }

     @GetMapping("/{id}")
    public Plan find(@PathVariable int id){
        return planService.buscarPlan(id);
     }

     @PostMapping("/modify")
    public String modify(Plan plan){
        planService.modificarPlan(plan);
        return "Plan modificado con exito";
     }
}
