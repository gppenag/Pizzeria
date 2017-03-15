/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase automatiza el pedido de pizza por los clientes,
 * 
 */
public class PantallaTactil {
/**
 * Este metodo permite una vez que los clientes han confirmado su pedido, imprima el precio final  
 * y el progreso de su alimento como se está preparando y cociendo, para ello necesita tres parametros 
 * 
     * @param p recibe el precio, tamaño, numero de coberturas y base de la pizza 
     * @param b recibe el precio, tamaño y sabor de la bebida
     * @param c recibe el nombre del cliente
 */
        public void proceso(Pizza p, Bebida b, Clientes c){
            
            try {
                System.out.println("El precio de la pizza es "+ p.getCosto());
                System.out.println("El precio de la bebida es "+ b.priceBebida());
                System.out.println(c.getNombre()+" El precio total a cancelar es "+(p.getCosto()+b.priceBebida()));
                
                System.out.print("Preparando la pizza de "+p.getPizza()+" tamaño "+p.getTamanoPizza()+" base "+p.getBase());
                System.out.println(" y la bebida de sabor "+b.sabor+" tamaño "+b.tamanoBebida);
                Thread.sleep(10000);
                System.out.println("Ya esta lista la bebida de sabor "+b.sabor+" tamaño "+b.tamanoBebida);
                Thread.sleep(9000);
                System.out.println("Ya esta lista la pizza de sabor "+p.getPizza()+" tamaño "+p.getTamanoPizza()+" base "+p.getBase());
            } catch (InterruptedException ex) {
                Logger.getLogger(PantallaTactil.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
}
