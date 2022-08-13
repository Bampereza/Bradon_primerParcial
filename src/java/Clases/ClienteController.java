/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author brand
 */
public class ClienteController {
    
       Cliente[] tablaCliente;
       int indiceArray;
    
    public ClienteController(){
        this.tablaCliente = new Cliente[100];
        this.indiceArray=0;
    }
    
     public void guardarCliente(Cliente cliente){
        this.tablaCliente[this.indiceArray]=cliente;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public Cliente[] getCliente(){
        return this.tablaCliente;
    }
    
}
