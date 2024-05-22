/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edpractica;

/**
 *
 * @author David
 */
public class Tarea6EDClase {
     public static final double DESCUENTO2 = 0.95;
     public static final double DESCUENTO1 = 0.8;
     public static final int DESCUENTO3 = 5;
     
     public void aplicarDescuento(double precioProducto, int numProductos){     
          double total;
          
    if(numProductos>3)
        precioProducto-=DESCUENTO3;
            if (numProductos!=0){
            total = precioProducto*DESCUENTO1;
            imprimirProducto(total);
        }else {
            total = precioProducto*DESCUENTO2;
            imprimirProducto(total);
        }   

    }

    public void imprimirProducto(double totalProducto) {
        System.out.println("El total a pagar es:"+totalProducto);
        System.out.println("Enviado");
    }
 
   
    
}
