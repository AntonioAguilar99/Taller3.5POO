/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3.pkg5;

/**
 *
 * @author anton
 */
public class Vehiculo {
    public void moverse(){
        System.out.println("El vehiculo se esta moviendo");
    }
}
class Bicicleta extends Vehiculo{
    @Override
    public void moverse(){
        System.out.println("La bicicleta se esta moviendo");
    }
}