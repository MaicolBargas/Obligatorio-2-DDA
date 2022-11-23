package com.obligatorio.PescettoBargas.service;


import com.obligatorio.PescettoBargas.model.Cliente;
import com.obligatorio.PescettoBargas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import java.util.List;

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

    @Override
    public void borrarCliente(int id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Cliente buscarCliente(int id) {
        return null;
    }

    @Override
    public Cliente modificarCliente(Cliente cliente) {
        return clienteRepository.saveAndFlush(cliente);
    }
}
