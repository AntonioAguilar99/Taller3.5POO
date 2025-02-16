/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3.pkg5;

/**
 *
 * @author anton
 */
public class UsoIncorrecto {
       public void moverse() {
        System.out.println("El vehículo se esta moviendo.");
    }
}

class Bicicleta extends Vehiculo {
    // Intento de sobrescribir cambiando la firma (Error de compilacion)
    // Esto no es una sobrescritura valida, sino una sobrecarga de metodo,
    // ya que el nombre es el mismo pero cambia el número/tipo de parámetros.
    // ERROR: Este método no sobrescribe el de la superclase, sino que crea uno nuevo con una firma distinta.
    public void moverse(String tipo) {
        System.out.println("La bicicleta se está moviendo de tipo: " + tipo);
    }

    // Sobrescritura sin @Override (No genera error, pero es mala practica)
    // Sin la anotación @Override, el compilador no verifica si realmente estamos sobrescribiendo un metodo.
    // Si el método en la clase base cambia de nombre o parámetros, este método en la subclase no generara un error
    // y simplemente se considerará un metodo nuevo, lo que podría causar problemas en el codigo.
    // ERROR POTENCIAL: Si el método de la superclase se renombra o se elimina, este método no generará una advertencia.
    public void moverse() {
        System.out.println("La bicicleta se esta moviendo pedaleando.");
    }
}
/*
public class Prueba {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bicicleta = new Bicicleta(); // Se usa polimorfismo

        vehiculo.moverse();
        bicicleta.moverse(); // Llamará al método sobrescrito en Bicicleta

    }
}
*/