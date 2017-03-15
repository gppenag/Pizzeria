/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * La clase Main ingresa los datos a las diferentes clases y muestra opciones
 * para que el cliente las seleccione, tiene en cuenta que el cliente puede
 * seleccionar opciones que no son validas entonces el programa pregunta de
 * nuevo la opcion hasta que seleccione una valida, el programa termina cuando
 * el nuevo cliente ya no desee pedir pedidos
 */
public class Main {

    public static void main(String[] args) {

        java.util.Scanner teclado = new java.util.Scanner(System.in);

        boolean n = true;
        do {

            System.out.println("Nombre: ");
            String c = teclado.nextLine();
            Clientes cliente = new Clientes(c);

            System.out.println("Seleccione tamaño de bebida: ");
            for (int i = 0; i < Bebida.TAMANOBEBIDA.length; i++) {
                System.out.println((i + 1) + ". " + Bebida.TAMANOBEBIDA[i]);
            }
            int opcionB1 = teclado.nextInt();
            if ((opcionB1 > 2) || (opcionB1 < 1)) {
                do {
                    System.out.println("digite una opcion valida ");
                    opcionB1 = teclado.nextInt();
                } while ((opcionB1 > 2) || (opcionB1 < 1));
            }

            System.out.println("");
            System.out.println("Seleccione el sabor de la bebida: ");
            for (int i = 0; i < Bebida.SABORES.length; i++) {
                System.out.println((i + 1) + ". " + Bebida.SABORES[i]);
            }
            int opcionB2 = teclado.nextInt();
            if ((opcionB2 > 2) || (opcionB2 < 1)) {
                do {
                    System.out.println("digite una opcion valida ");
                    opcionB2 = teclado.nextInt();
                } while ((opcionB2 > 2) || (opcionB2 < 1));
            }

            System.out.println("");

            Bebida bebida = new Bebida(Bebida.TAMANOBEBIDA[opcionB1 - 1], Bebida.SABORES[opcionB2 - 1]);

            System.out.println("Selecciona el tamaño de la pizza: ");
            for (int i = 0; i < Pizza.TAMANOPIZZA.length; i++) {
                System.out.println((i + 1) + ". " + Pizza.TAMANOPIZZA[i]);
            }
            int opcionP1 = teclado.nextInt();
            if ((opcionP1 > 3) || (opcionP1 < 1)) {
                do {
                    System.out.println("digite una opcion valida ");
                    opcionP1 = teclado.nextInt();
                } while ((opcionP1 > 3) || (opcionP1 < 1));
            }

            System.out.println("");
            System.out.println("Seleccione el tipo de pizza que desea: ");
            for (int i = 0; i < Pizza.PIZZA.length; i++) {
                System.out.println((i + 1) + ". " + Pizza.PIZZA[i]);
            }
            int opcionP2 = teclado.nextInt();
            if ((opcionP2 > 2) || (opcionP2 < 1)) {
                do {
                    System.out.println("digite una opcion valida ");
                    opcionP2 = teclado.nextInt();
                } while ((opcionP2 > 2) || (opcionP2 < 1));
            }

            System.out.println("");
            System.out.println("Seleccione que base para la pizza desea: ");
            for (int i = 0; i < Pizza.BASE.length; i++) {
                System.out.println((i + 1) + ". " + Pizza.BASE[i]);
            }
            int opcionP3 = teclado.nextInt();
            if ((opcionP3 > 2) || (opcionP3 < 1)) {
                do {
                    System.out.println("digite una opcion valida ");
                    opcionP3 = teclado.nextInt();
                } while ((opcionP3 > 2) || (opcionP3 < 1));
            }
            System.out.println("");

            Pizza pizza = new Pizza(Pizza.TAMANOPIZZA[opcionP1 - 1], Pizza.PIZZA[opcionP2 - 1], Pizza.BASE[opcionP3 - 1]);

            if ((opcionP2 - 1) == 0) {
                System.out.println("Pizza Do-It-Yourself tendrá una base con salsa de tomate, cuántas coberturas desea: ");
                int coberturas = teclado.nextInt();
                pizza.pricePizza(coberturas);
            } else {
                pizza.pricePizza(0);
            }

            PantallaTactil pantallaTactil = new PantallaTactil();
            pantallaTactil.proceso(pizza, bebida, cliente);
            
            
            System.out.println(" Digita opcion 1 para ingresar tu pedido ");
            int off = teclado.nextInt();
            if (!(off == 1)) {
                n = false;
            }

        } while (n);
    }
}
