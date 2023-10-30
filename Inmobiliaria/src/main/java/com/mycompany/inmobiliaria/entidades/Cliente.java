/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmobiliaria.entidades;

import java.util.List;

/**
 *
 * @author zapam
 */
public class Cliente {
    
    private int dni;
    private String nombre;
    private String apellido;
    private String telefono;
    //referido al inmueble buscado...FALTA REFINAR HISTORIA NOTENGOIDEA Q hacer con esto
    private List<Inmueble> inmueblesBuscado;

    public Cliente() {
    }
   
    
    //GETTERS-SETTERS
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Inmueble> getInmueblesBuscado() {
        return inmueblesBuscado;
    }

    public void setInmueblesBuscado(List<Inmueble> inmueblesBuscado) {
        this.inmueblesBuscado = inmueblesBuscado;
    }
    
    
}
