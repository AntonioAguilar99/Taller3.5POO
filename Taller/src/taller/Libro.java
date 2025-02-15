/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author anton
 */
public class Libro {
      String titulo;
    String autor;
    int numeropaginas;
    
    public Libro(){ 
      this.titulo = "Desconocido";
      this.autor = "Desconocido";
      this.numeropaginas = 0;
            
    }

    public Libro(String titulo, String autor, int numeropaginas){       
      this.titulo = titulo;
      this.autor = autor;
      this.numeropaginas = numeropaginas;
        
    }

    @Override
    public String toString() {
      String Datos = "";
      Datos += "TITULO: " + titulo + "\n";
      Datos += "AUTOR: " + autor + "\n";
      Datos += "NUMERODEPAGINAS: " + numeropaginas + "\n";
      return Datos;
    }
}
