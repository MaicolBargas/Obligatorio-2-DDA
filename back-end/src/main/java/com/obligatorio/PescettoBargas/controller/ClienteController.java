package com.obligatorio.PescettoBargas.controller;


import java.util.List;

import com.obligatorio.PescettoBargas.model.Cliente;
import com.obligatorio.PescettoBargas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        clienteService.borrarCliente(id);
        return "Cliente borrado correctamente";
    }

    @GetMapping("/{id}")
    public Cliente find(@PathVariable int id){
        return clienteService.buscarCliente(id);
    }

    @PostMapping("/modify")
    public String modify(Cliente cliente){
        clienteService.modificarCliente(cliente);
        return "Cliente modificado con exito";
    }
}
