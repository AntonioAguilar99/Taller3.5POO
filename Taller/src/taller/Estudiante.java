/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author anton
 */
public class Estudiante {
    
    String nombre;
    int edad;
    String curso;
    
    public Estudiante() {
        this("Desconocido", 0, "Sin asignar");
    }

    
    public Estudiante(String nombre, int edad) {
        this(nombre, edad, "Sin asignar");
    }

    // Constructor que acepta todos los parámetros y usa this()
    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    @Override
    public String toString() {
        String Datos = "";
        Datos += "NOMBRE: " + nombre + "\n";
        Datos += "EDAD: " + edad + "\n";
        Datos += "CURSO: " + curso + "\n";
        return Datos;
    }
}
