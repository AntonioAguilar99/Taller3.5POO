/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author anton
 */
public class Prueba {
      private String mensaje = "Hola desde la instancia";

    // Método estático incorrecto 
    /*
    public static void metodoEstatico() {
        System.out.println(this.mensaje); 
    */

    // Método corregido
    public static void metodoEstaticoCorregido() {
        System.out.println("Este es un método estático y no puede usar this");
    }
}
