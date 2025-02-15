/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;

/**
 *
 * @author anton
 */
public class Prueba1 {
        
  
    public void ejecutarPruebas() {
     
        Producto producto = new Producto("Smartphone", 799.99, "12 pulgadas");

        
        System.out.println("Accediendo a los atributos directamente:");
        System.out.println("Nombre: " + producto.nombre);
        System.out.println("Precio: $" + producto.precio);
        System.out.println("Stock: " + producto.stock);

        System.out.println("\nMostrando informacion con el metodo:");
        producto.mostrarInfo();
    }
}
