
package com.example;

/**
 *
 * @author mont_
 */
public class Banco implements InterfazBancaria{
    
    private Cliente[] clientes;
    private int numeroDeClientes;

    public Banco() {
       this.clientes = new Cliente[10];
       numeroDeClientes=0;
        
    }
    @Override
    public void agregarCliente(String nombre, String apellido, LineaServicio lineaServicio){
        int i =numeroDeClientes++;
        clientes[i]= new Cliente(nombre,apellido,lineaServicio);
    };
    
    @Override
    public Cliente getCliente(int indexCliente){
        return clientes[indexCliente];
    };
    
    
    @Override
    public int getNumeroDeClientes(){
        return numeroDeClientes;
    };

    

    
    
    
    
}
