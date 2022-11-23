package com.obligatorio.PescettoBargas.service;

import com.obligatorio.PescettoBargas.model.Cliente;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ClienteService {
    public Cliente guardarCliente(Cliente cliente);
    public List<Cliente> listarCliente();
    public void borrarCliente(int id);
    public Cliente buscarCliente(int id);
    public Cliente modificarCliente(Cliente cliente);
}
