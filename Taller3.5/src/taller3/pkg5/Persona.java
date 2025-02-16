/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3.pkg5;

/**
 *
 * @author anton
 */
public class Persona {
    public void presentarse() {
        System.out.println("Hola soy una persona.");
    }
}

class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola soy un estudiante.");
    }
}

class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola soy un profesor.");
    }
}

    

