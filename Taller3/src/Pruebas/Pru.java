/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Vehiculos.Vehiculo;
import Vehiculos.Moto;

/**
 * Clase de prueba para demostrar problemas de acceso a miembros con visibilidad de paquete.
 *
 * En este ejemplo se intenta acceder a la propiedad 'tipo' y al método 'mostrarTipo()' de las clases
 * Vehiculo y Moto. Ambos miembros tienen acceso de paquete (default), por lo que sólo pueden
 * ser accedidos desde clases que se encuentren en el mismo paquete (en este caso, el paquete "Vehiculos").
 * Al estar esta clase de prueba en el paquete "Pruebas", se producen errores de compilación.
 */
public class Pru {
        public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Generico");
        Moto moto = new Moto("Deportiva");

          // Intento de acceso directo a la propiedad 'tipo'
        // ERROR de compilación: 'tipo' tiene acceso de paquete y no es accesible desde el paquete Pruebas.
        /*
        System.out.println("Vehiculo tipo: " + vehiculo.tipo); // ERROR de compilación
        System.out.println("Moto tipo: " + moto.tipo);           // ERROR de compilación

     //Intento de invocar el método 'mostrarTipo()'
        // ERROR de compilación: 'mostrarTipo()' tiene acceso de paquete y no es accesible desde el paquete Pruebas.
        vehiculo.mostrarTipo(); // ERROR de compilación
        moto.mostrarTipo();     // ERROR de compilación
        */
    }
}
