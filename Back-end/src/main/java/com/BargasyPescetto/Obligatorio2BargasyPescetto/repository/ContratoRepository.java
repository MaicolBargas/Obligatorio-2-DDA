package main.java.com.BargasyPescetto.Obligatorio2BargasyPescetto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BargasyPescetto.Obligatorio2BargasyPescetto.entity.Contrato;

@Repository
public class ContratoRepository extends JpaRepository<Contrato, Integer> {
    
}
