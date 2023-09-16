
package com.example;

/**
 *
 * @author mont_
 */
public abstract class Cuenta {
    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double monto) {
        saldo += monto;
    }

    @Override
    public String toString() {
        return obtenerDescripcion()+"El saldo de su cuenta es: "+saldo;
    }
    
    public abstract String obtenerDescripcion();
    
    public abstract boolean retiro(double monto);
    
}
