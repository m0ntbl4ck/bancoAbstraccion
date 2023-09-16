
package com.example;

/**
 *
 * @author mont_
 */
public class ReporteCliente {
    
    private Banco banco;
    
    
    public void generarReporte(){
        System.out.println("REPORTE DE CLIENTES\n");
        
        for (int i = 0; i < banco.getNumeroDeClientes(); i++) {
            
            Cliente cliente = banco.getClientes(i);
            
            System.out.println();
            System.out.println("Cliente: "+
               cliente.getPrimerNombre()+", "+
                    cliente.getApellido());
                
            for (int j = 0; j < cliente.getnumeroDeCuentas(); j++) {
                Cuenta cuenta = cliente.getDeCuenta(i);
                
                
                System.out.println("   "+cuenta);
                
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
