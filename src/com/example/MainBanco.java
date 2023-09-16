
package com.example;

/**
 *
 * @author mont_
 */
public class MainBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        inicializarClientes(banco);
        
        ReporteCliente reporte = new ReporteCliente();
        reporte.setBanco(banco);
        reporte.generarReporte();
        
        
    }
    private static void inicializarClientes(Banco banco){
        Cliente cliente;
        Cliente cliente1;
         Cliente cliente2;
        Cliente cliente3;
        Cliente  cliente4;
        
        
        banco.agregarCliente("Brandon", "Vergara");
        cliente = banco.getClientes(0);
        cliente.agregarCuenta(new CuentaDeAhorros(500.00));
        
        banco.agregarCliente("Andrea", "Castro");
        cliente1 = banco.getClientes(1);
        CuentaDeAhorros cuenta1 = new CuentaDeAhorros(300.00);
        cliente1.agregarCuenta(cuenta1);
        cuenta1.deposito(500);
       cliente1.agregarCuenta(cuenta1);
         
         
        banco.agregarCliente("Andres", "Cortes");
        cliente2 = banco.getClientes(2);
        cliente2.agregarCuenta(new CuentaDeAhorros(200.00));
        
        banco.agregarCliente("Lorena", "Solarte");
        cliente3 = banco.getClientes(3);
        cliente3.agregarCuenta(new CuentaDeAhorros(500.00));
        
        
        banco.agregarCliente("José", "Rodriguez");
        cliente4 = banco.getClientes(4);
        CuentaDeAhorros cuenta2 =new CuentaDeAhorros(100.00);
        cuenta2.deposito(1500.0);
        cliente4.agregarCuenta(cuenta2);
        
      
        
        
    }
}
