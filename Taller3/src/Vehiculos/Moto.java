/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author anton
 */
public class Moto extends Vehiculo{
    
    public Moto(String tipo){
        super(tipo);
        
    }
    public void haciendo() {
        System.out.println("La moto " + tipo + " esta arrancando.");
}
}