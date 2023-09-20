
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

    @Override
    public String toString() {
        return "El saldo de su cuenta es: "+saldo;
    }

    
}
