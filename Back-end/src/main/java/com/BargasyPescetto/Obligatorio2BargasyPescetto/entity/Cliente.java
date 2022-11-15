package com.BargasyPescetto.Obligatorio2BargasyPescetto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    private int ci;

    @Column(length = 30)
    private String nombre;

    @Column(length = 30)
    private String apellido;

    @Column(length = 30)
    private String email;

    @Override
    public String toString() {
        return "Cliente [ci=" + ci + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + "]";
    }

    public Cliente(int ci, String nombre, String apellido, String email) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente() {
    }

}
