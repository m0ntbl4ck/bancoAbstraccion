
package com.example;

/**
 *
 * @author mont_
 */
public class Cliente {
    private String primerNombre;
    private String apellido;
    private OperacionesCuentas[] cuentas;
    private int numeroDeCuentas;
    private LineaServicio lineaServicio;

    public Cliente(String primerNombre,String apellido,LineaServicio lineaServicio ) {
        this.primerNombre =primerNombre;
        this.apellido = apellido;
        this.cuentas = new OperacionesCuentas[10];
        this.numeroDeCuentas=0;
        this.lineaServicio = lineaServicio;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellido() {
        return apellido;
    }
        public void agregarCuenta(OperacionesCuentas cuenta) {
        int i = numeroDeCuentas++;
       cuentas[i]= cuenta;
    }
   

    public int getnumeroDeCuentas() {
        return numeroDeCuentas;
    }



    public OperacionesCuentas getDeCuenta(int indiceCuenta) {
        return cuentas[indiceCuenta];
    }

    public LineaServicio getLineaServicio() {
        return lineaServicio;
    }

    public void setLineaServicio(LineaServicio lineaServicio) {
        this.lineaServicio = lineaServicio;
    }

    
    
    
}
