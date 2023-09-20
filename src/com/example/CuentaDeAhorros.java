
package com.example;

/**
 *
 * @author mont_
 */
public class CuentaDeAhorros extends Cuenta implements OperacionesCuentas{
    
    private final double limiteDeRetiro;

    public CuentaDeAhorros(double saldo) {
        this(100,saldo);
    }

    
    public CuentaDeAhorros(double limiteDeRetiro, double saldo) {
        super(saldo);
        this.limiteDeRetiro = limiteDeRetiro;
    }
    
    
    @Override
    public String obtenerDescripcion() {
        return "Cuenta de Ahorros ";
    }

    @Override
    public boolean retiro(double monto) {
       
        if(monto <= saldo && monto <= limiteDeRetiro){
            saldo -= monto;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void deposito(double monto) {
        saldo += monto;
    }

    @Override
    public double getSaldo() {
       return saldo;
    }
    
}
