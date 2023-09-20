
package com.example;

/**
 *
 * @author mont_
 */
public interface InterfazBancaria {
    public void agregarCliente(String nombre, String apellido, LineaServicio lineaServicio);
    public Cliente getCliente(int indexCliente);
    public int getNumeroDeClientes();
    
    
    public default void generarReporte(){
        System.out.println("\t\t\tREPORTE DE CLIENTES");
        System.out.println("\t\t\t===================");
        
        for (int i = 0; i < this.getNumeroDeClientes(); i++) {
            
            Cliente cliente = this.getCliente(i);
            
            System.out.println();
            System.out.println("Cliente: "+
               cliente.getPrimerNombre()+", "+
                    cliente.getApellido());
                
            for (int j = 0; j < cliente.getnumeroDeCuentas(); j++) {
                OperacionesCuentas cuenta = cliente.getDeCuenta(j);
                
                
                System.out.println("     "+cuenta);
                
            }
        }
    }
}
