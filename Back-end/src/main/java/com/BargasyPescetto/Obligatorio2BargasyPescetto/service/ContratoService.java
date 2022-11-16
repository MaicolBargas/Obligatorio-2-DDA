package main.java.com.BargasyPescetto.Obligatorio2BargasyPescetto.service;

import java.util.List;

import com.BargasyPescetto.Obligatorio2BargasyPescetto.entity.Contrato;

public interface ContratoService {
    public Contrato guardarContrato(Contrato contrato);
    public List<Contrato> listarContrato();
}
