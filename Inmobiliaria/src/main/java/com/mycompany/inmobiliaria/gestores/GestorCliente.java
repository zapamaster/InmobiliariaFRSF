/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmobiliaria.gestores;

import com.mycompany.inmobiliaria.dtos.ClienteDTO;
import com.mycompany.inmobiliaria.excepciones.ClienteExistenteException;

/**
 *
 * @author zapam
 */
public class GestorCliente {
    
    public GestorCliente(){
        
    }
    
    
    public int[] validarDatos(ClienteDTO dto){
        //Vector asociado a cada campo de los datos del cliente, 1 quiere decir q el campo no está completado correctamente.
        //Es un mensaje x cada campo y uno en caso q no haya nada completado.
        int[] mensajes = new int[5];
        
       if(dto.getNombre().isEmpty() || dto.getDni().isEmpty() ||  dto.getApellido().isEmpty() ||  dto.getTelefono().isEmpty())
         mensajes[0] = 1;
  
       if(dto.getNombre().matches(".*[^aA-zZ]+$.*"))
           mensajes[1]= 1;
        if(dto.getDni().matches(".*[^0-9].*" ))
           mensajes[2] = 1;
        if(dto.getApellido().matches(".*[^aA-zZ]+$.*"))
           mensajes[3]= 1;
        if(dto.getTelefono().matches(".*[^0-9].*" ))
           mensajes[4] = 1;
     
       return mensajes;
    }

    public void crearCliente(ClienteDTO cliente) throws ClienteExistenteException {
        if (existeCliente(cliente) == true) {
            throw new ClienteExistenteException("El cliente ya existe en la base de datos.");
        } else {
            //creo el cliente efectivamente
      
            
        } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public boolean existeCliente(ClienteDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void actualizarCliente(ClienteDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
