package com.BargasyPescetto.Obligatorio2BargasyPescetto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BargasyPescetto.Obligatorio2BargasyPescetto.entity.Cliente;
import com.BargasyPescetto.Obligatorio2BargasyPescetto.service.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/add")
    public String add(@RequestBody Cliente cliente){
        clienteService.guardarCliente(cliente);
        return "Nuevo cliente añadido exitosamente";
    }

    @GetMapping("/list")
    public List<Cliente> list(){
        return clienteService.listarCliente();
    }

}
