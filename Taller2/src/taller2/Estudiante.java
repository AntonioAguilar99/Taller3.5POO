/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author anton
 */
public class Estudiante {
    private String nombre;
    private String edad;
    
    public Estudiante(){
      this("Desconocido", "Desconocida");
    }
    
    public Estudiante(String nombre, String edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: " + this.nombre + "Edad: " + this.edad);
    }
}
