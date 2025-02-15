/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;

/**
 *
 * @author anton
 */
public class Producto {
    String nombre;
    double precio;
    String stock;

     Producto(String nombre, double precio, String stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "Precio: " + precio + "Stock: " + stock);
    }
    
}
