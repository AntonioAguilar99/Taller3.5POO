/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3.pkg5;

public class Prueba {
    public static void main(String[] args) {
        Persona[] personas = {new Persona(), new Estudiante(), new Profesor()};
        for (Persona persona : personas) {
            persona.presentarse();
        }
         
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bicicleta = new Bicicleta();

        vehiculo.moverse();
        bicicleta.moverse();
    }
}


