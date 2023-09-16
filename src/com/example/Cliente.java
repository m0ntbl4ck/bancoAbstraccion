
package com.example;

/**
 *
 * @author mont_
 */
public class Cliente {
    private String primerNombre;
    private String apellido;
    private Cuenta[] cuentas;
    private int numeroDeCuentas;

    public Cliente(String primerNombre,String apellido) {
        this.primerNombre =primerNombre;
        this.apellido = apellido;
        cuentas = new Cuenta[10];
        numeroDeCuentas=0;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellido() {
        return apellido;
    }
        public void agregarCuenta(Cuenta cuenta) {
        int i = numeroDeCuentas++;
       cuentas[i]= cuenta;
    }
   

    public int getnumeroDeCuentas() {
        return numeroDeCuentas;
    }



    public Cuenta getDeCuenta(int indiceCuenta) {
        return cuentas[indiceCuenta];
    }

    
    
    
}
