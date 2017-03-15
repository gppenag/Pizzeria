/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * Esta clase permite al cliente pedir a partir de un conjunto fijo de bebidas,
 * tales como sabores de cola y limonada, cada uno en tamaño grande o pequeño
 */
public class Bebida {
    public static final String[] TAMANOBEBIDA={"Grande","Pequeño"};
    public static final String [] SABORES={"Cola","Limonada"};
   
  
    public String tamanoBebida;
    public String sabor;
    
/*
*
*Este constructor permite crear la bebida,tiende 2 parametros 
*para el tamaño y el sabor
*/
    public Bebida( String tamanoBebida, String sabor) {
        this.tamanoBebida = tamanoBebida;
        this.sabor = sabor;
    }

    public String getTamanoBebida() {
        return tamanoBebida;
    }

    public void setTamanoBebida(String tamanoBebida) {
        this.tamanoBebida = tamanoBebida;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
/**
*El metodo le asigna a la bebida un precio de 50 si es grande y de 20 si es pequeña
     * @return el precio de la bebida
*/
    public double priceBebida(){
      if( "Grande".equals(tamanoBebida) )
          return 50;
      else
          return 20;
    }
}
