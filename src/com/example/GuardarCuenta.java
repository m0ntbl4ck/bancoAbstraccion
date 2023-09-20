
package com.example;

/**
 *
 * @author mont_
 */
public class GuardarCuenta extends Cuenta implements OperacionesCuentas{
    
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

    @Override
    public double getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
