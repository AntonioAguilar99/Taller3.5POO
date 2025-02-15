/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner scanner = new Scanner(System.in);

      
        Libro libro1 = new Libro();
        
   
        System.out.println("Ingrese los datos del libro:");
        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Numero de paginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); 
        Libro libro2 = new Libro(titulo, autor, paginas);

        
        CuentaBancaria cuenta1 = new CuentaBancaria();

     
        System.out.println("\nIngrese los datos de la cuenta bancaria:");
        System.out.print("Numero de cuenta: ");
        int numerocuenta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        CuentaBancaria cuenta2 = new CuentaBancaria(numerocuenta, tipoCuenta);

       
        System.out.print("Saldo inicial: ");
        int saldo = scanner.nextInt();
        scanner.nextLine(); 
        CuentaBancaria cuenta3 = new CuentaBancaria(numerocuenta, tipoCuenta, saldo);

       
        Estudiante estudiante1 = new Estudiante();

      
        System.out.println("\nIngrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); 
        Estudiante estudiante2 = new Estudiante(nombre, edad);

      
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        Estudiante estudiante3 = new Estudiante(nombre, edad, curso);

        
        System.out.println("\n--- Detalles de los Objetos ---");
        System.out.println("Libro 1 (Constructor vacio):\n" + libro1);
        System.out.println("Libro 2 (Datos ingresados):\n" + libro2);
        System.out.println("Cuenta Bancaria 1 (Constructor vacio):\n" + cuenta1);
        System.out.println("Cuenta Bancaria 2 (Numero y tipo de cuenta):\n" + cuenta2);
        System.out.println("Cuenta Bancaria 3 (Numero, tipo y saldo):\n" + cuenta3);
        System.out.println("Estudiante 1 (Constructor vacío):\n" + estudiante1);
        System.out.println("Estudiante 2 (Nombre y edad):\n" + estudiante2);
        System.out.println("Estudiante 3 (Nombre, edad y curso):\n" + estudiante3);

        scanner.close();
    }
    
}
