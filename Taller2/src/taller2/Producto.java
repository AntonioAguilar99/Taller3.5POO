/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author anton
 */
public class Producto {
    private String nombre;
    private int precio;
    
    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
        
    }
    
    public void mostrarProducto() {
        System.out.println("Nombre: " + nombre); 
        System.out.println("Precio: $" + precio); 
    }
}
