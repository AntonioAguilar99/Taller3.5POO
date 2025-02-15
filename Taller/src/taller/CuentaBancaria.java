/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author anton
 */
public class CuentaBancaria {
    int numerocuenta;
    String tipoCuenta;
    int saldo;
    
    
    public CuentaBancaria() {
        this.numerocuenta = 0;
        this.tipoCuenta = "";
        this.saldo = 0;
    }
    
    
    public CuentaBancaria(int numerocuenta, String tipoCuenta) {
        this.numerocuenta = numerocuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
    }
    
    
    public CuentaBancaria(int numerocuenta, String tipoCuenta, int saldo) {
        this.numerocuenta = numerocuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String Datos = "";
        Datos += "NUMERO DE CUENTA: " + numerocuenta + "\n";
        Datos += "TIPO DE CUENTA: " + tipoCuenta + "\n";
        Datos += "SALDO: " + saldo + "\n";
        return Datos;
    }
}
