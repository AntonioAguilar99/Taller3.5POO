/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author anton
 */
public class Vehiculo {
    String tipo;
    
    public Vehiculo(String tipo){
        this.tipo = tipo;
    }
    
    void mostrarTipo(){
        System.out.println("Tipo de vehiculos: " + tipo);
    }
}
