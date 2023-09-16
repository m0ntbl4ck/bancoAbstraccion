
package com.example;

/**
 *
 * @author mont_
 */
public class Banco {
    
    private Cliente[] clientes;
    private int numeroDeClientes;

    public Banco() {
       this.clientes = new Cliente[10];
       numeroDeClientes=0;
        
    }
    
    public void agregarCliente(String nombre, String apellido){
        int i = numeroDeClientes++;
        clientes[i]= new Cliente(nombre,apellido);
    }

    public Cliente getClientes(int indexCliente) {
        return clientes[indexCliente];
    }

    public int getNumeroDeClientes() {
        return numeroDeClientes;
    }
    
}
