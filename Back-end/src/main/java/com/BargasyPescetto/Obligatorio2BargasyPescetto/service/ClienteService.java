package com.BargasyPescetto.Obligatorio2BargasyPescetto.service;

import java.util.List;

import com.BargasyPescetto.Obligatorio2BargasyPescetto.entity.Cliente;

public interface ClienteService {
    public Cliente guardarCliente(Cliente cliente);
    public List<Cliente> listarCliente();
}
