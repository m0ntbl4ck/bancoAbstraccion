
package com.example;

/**
 *
 * @author mont_
 */
public class GuardarCuenta extends Cuenta{
    
    double interes = 0.06;

    public GuardarCuenta(double saldo) {
       super(saldo);
    }

    @Override
    public String obtenerDescripcion() {
        return "Cuenta de Ahorros ";
    }

    @Override
    public boolean retiro(double monto) {
        if(monto <= saldo){
            saldo -= monto;
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public void deposito(double monto){
        saldo += monto;
        saldo += saldo*interes;
    }
    
}
