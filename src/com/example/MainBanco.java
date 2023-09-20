
package com.example;

/**
 *
 * @author mont_
 */
public class MainBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        inicializarClientes(banco);
        
 
        banco.generarReporte();
   
    }
    private static void inicializarClientes(Banco banco){
        Cliente cliente;
        Cliente cliente1;
         Cliente cliente2;
        Cliente cliente3;
        Cliente  cliente4;
        
        
        banco.agregarCliente("Brandon", "Vergara",LineaServicio.AMERICANEXPRESS);
        cliente = banco.getCliente(0);
        cliente.agregarCuenta(new CuentaDeAhorros(500.00));
        
        banco.agregarCliente("Andrea", "Castro",LineaServicio.VISA);
        cliente1 = banco.getCliente(1);
        CuentaDeAhorros cuenta1 = new CuentaDeAhorros(300.00);
        cliente1.agregarCuenta(cuenta1);
        cuenta1.deposito(500);
       
         
         
        banco.agregarCliente("Andres", "Cortes",LineaServicio.MASTERCARD);
        cliente2 = banco.getCliente(2);
        cliente2.agregarCuenta(new CuentaDeAhorros(200.00));
        
        banco.agregarCliente("Lorena", "Solarte",LineaServicio.AMERICANEXPRESS);
        cliente3 = banco.getCliente(3);
        cliente3.agregarCuenta(new CuentaDeAhorros(500.00));
        
        
        banco.agregarCliente("José", "Rodriguez",LineaServicio.VISA);
        cliente4 = banco.getCliente(4);
        CuentaDeAhorros cuenta2 =new CuentaDeAhorros(100.00);
        cuenta2.deposito(1500.0);
        cliente4.agregarCuenta(cuenta2);
        
 
        
    }
}
