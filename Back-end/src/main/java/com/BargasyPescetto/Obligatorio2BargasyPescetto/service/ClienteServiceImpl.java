package com.BargasyPescetto.Obligatorio2BargasyPescetto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BargasyPescetto.Obligatorio2BargasyPescetto.entity.Cliente;
import com.BargasyPescetto.Obligatorio2BargasyPescetto.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired 
    private ClienteRepository clienteRepository;

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> listarCliente() {
        return clienteRepository.findAll();
    }
    
}
