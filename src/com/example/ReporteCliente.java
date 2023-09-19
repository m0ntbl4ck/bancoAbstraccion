
package com.example;

/**
 *
 * @author mont_
 */
public class ReporteCliente {
    
    private Banco banco;
    
    
    public void generarReporte(){
        System.out.println("\t\t\tREPORTE DE CLIENTES");
        System.out.println("\t\t\t===================");
        
        for (int i = 0; i < banco.getNumeroDeClientes(); i++) {
            
            Cliente cliente = banco.getClientes(i);
            
            System.out.println();
            System.out.println("Cliente: "+
               cliente.getPrimerNombre()+", "+
                    cliente.getApellido());
                
            for (int j = 0; j < cliente.getnumeroDeCuentas(); j++) {
                Cuenta cuenta = cliente.getDeCuenta(j);
                
                
                System.out.println("     "+cuenta);
                
            }
        }
    }
    public Banco getBanco(){
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

     

}
