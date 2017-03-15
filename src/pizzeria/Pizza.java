/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 *La siguiente clase le permite a los clientes navegar por las pizzas que se ofrecen
 * y seleccionar su elección las pizzas solo pueden ser de 2 tipos basicos Do-It-Yourself y Prefab
 * el tamaño de la pizza tambien solo puede ser de 6, 9 y 12 pulgadas y la base puede ser corteza profunda y crujiente
 * 
 */
public class Pizza {

    private String pizza;
    private String tamanoPizza;
    private String base;
    private double costo;

    public static final String[] TAMANOPIZZA = {"6 pulgadas", "9 pulgadas", "12 pulgadas"};
    public static final String[] PIZZA = {"Do-It-Yourself", "Prefab"};
    public static final String[] BASE = {"Corteza Profunda", "Crujiente"};
/**
 *
 *El constructor permite crear una pizza con un tamaño, tipo de pizza y base,
     * @param tamanoPizza permite ingresar al usuario el tamaño de la pizza
     * @param pizza permite ingresar al usuario el tipo de pizza
     * @param base resar al usuario la base de la piza que desea
 */
    public Pizza(String tamanoPizza, String pizza, String base) {
        this.tamanoPizza = tamanoPizza;
        this.pizza = pizza;
        this.base = base;

    }
/**
 * El metodo permite asignar un precio a la pizza seleccionada por el cliente,
 * dicho precio tiene en cuenta su tamaño, entre más grande sea, más costosa es, 
 * y tiene en cuenta el numero de coberturas que desea el cliente de acuerdo al tipo
 * de pizza que selecciono, asigna a la pizza Prefab 0 coberturas, ya que él no las puede seleccionar
 * son fijas, en ese caso el costo de la pizza aumenta solo 5 pesos, en caso de que sea de tipo 
 * Do-It-Yourself son 5 pesos más por cada cobertura que seleccione el cliente
 * @param coberturas ingresa el numero de coberturas 
 */
    public void pricePizza(int coberturas) {
        if (null == tamanoPizza) {
            costo = 150;
        } else switch (tamanoPizza) {
            case "12 pulgadas":
                costo = 180;
                break;
            case "9 pulgadas":
                costo = 160;
                break;
            default:
                costo = 150;
                break;
        }
        if (coberturas != 0) {
            costo =((5* coberturas)+costo);
        } else {
           costo = (costo + 5);
        }
    }
    
    public double getCosto (){
        return costo;
    }

    public String getTamanoPizza() {
        return tamanoPizza;
    }

    public void setTamanoPizza(String tamanoPizza) {
        this.tamanoPizza = tamanoPizza;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

}
