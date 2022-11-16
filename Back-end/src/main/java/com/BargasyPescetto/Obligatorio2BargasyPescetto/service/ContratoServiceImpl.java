package main.java.com.BargasyPescetto.Obligatorio2BargasyPescetto.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BargasyPescetto.Obligatorio2BargasyPescetto.entity.Contrato;
import com.BargasyPescetto.Obligatorio2BargasyPescetto.repository.ContratoRepository;

@Service
public class ContratoServiceImpl implements ContratoService {
    @Autowired
    private ContratoRepository contratoRepository;

    @Override
    public Contrato guardarContrato(Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    @Override
    public List<Contrato> listarContrato() {
        return contratoRepository.findAll();
    }

}
