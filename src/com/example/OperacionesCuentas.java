
package com.example;

/**
 *
 * @author mont_
 */
public interface OperacionesCuentas {
    public String obtenerDescripcion();
    public void deposito(double monto);
    public boolean retiro(double monto);
     public double getSaldo();
}
