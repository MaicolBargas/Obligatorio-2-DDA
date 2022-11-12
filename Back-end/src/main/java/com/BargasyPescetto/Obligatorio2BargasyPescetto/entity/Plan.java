package com.BargasyPescetto.Obligatorio2BargasyPescetto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "planes")
public class Plan implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 20)
    private String destino;

    @Column()
    private String fecha;

    @Column
    private char modalidad; //aerea(a)-maritima(m)-terrestre(t)

    @Column
    private int precio;

    
    @Override
    public String toString() {
        return "Plan [id=" + id + ", destino=" + destino + ", fecha=" + fecha + ", modalidad=" + modalidad + ", precio="
                + precio + "]";
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getDestino() {
        return destino;
    }


    public void setDestino(String destino) {
        this.destino = destino;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public char getModalidad() {
        return modalidad;
    }


    public void setModalidad(char modalidad) {
        this.modalidad = modalidad;
    }


    public int getPrecio() {
        return precio;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public Plan(int id, String destino, String fecha, char modalidad, int precio) {
        this.id = id;
        this.destino = destino;
        this.fecha = fecha;
        this.modalidad = modalidad;
        this.precio = precio;
    }
    public Plan(){}

}
