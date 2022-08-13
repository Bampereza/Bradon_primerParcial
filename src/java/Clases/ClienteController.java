
/*
 <!-Brandon Isaías Ampérez Aldana 0909-21-4628 -->
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
