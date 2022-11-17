package main.java.com.BargasyPescetto.Obligatorio2BargasyPescetto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BargasyPescetto.Obligatorio2BargasyPescetto.entity.Contrato;
import com.BargasyPescetto.Obligatorio2BargasyPescetto.service.ContratoService;

@RestController
@RequestMapping("/contrato")
public class ContratoController {
    @Autowired 
    private ContratoService contratoService;

    @PostMapping("/add")
    public String add(@RequestBody Contrato contrato){
        contratoService.guardarContrato(contrato);
        return "Nuevo contrato añadido exitosamente";
    }

    @GetMapping("/list")
    public List<Plan> list(){
        return contratoService.listarContrato();
    }
}
