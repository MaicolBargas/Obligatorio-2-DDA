package main.java.com.BargasyPescetto.Obligatorio2BargasyPescetto.entity;

import java.io.Serializable;
import java.lang.annotation.Inherited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Contrato implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int ciPasajero;
    
    @Column
    private int idPlan;

    
    public Contrato(int id, int ciPasajero, int idPlan) {
        this.id = id;
        this.ciPasajero = ciPasajero;
        this.idPlan = idPlan;
    }

    @Override
    public String toString() {
        return "Contrato [id=" + id + ", ciPasajero=" + ciPasajero + ", idPlan=" + idPlan + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCiPasajero() {
        return ciPasajero;
    }

    public void setCiPasajero(int ciPasajero) {
        this.ciPasajero = ciPasajero;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }


}
