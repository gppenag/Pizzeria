/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * Esta clase permite conocer al cliente
 */
public class Clientes {
    private String nombre;
    
/** 
 * este metodo es un constructor que permite crear un instancia de cliente
     * @param nombre
 */

    public Clientes(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
