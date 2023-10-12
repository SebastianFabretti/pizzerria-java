package proyectopizzeria;

import java.util.ArrayList;

public class ProyectoPizzeria {

    public static void main(String[] args) {
        
        Pizza p1 = new Pizza("Napolitana", 25, 1);
        Pizza p2 = new Pizza("Muzzarella", 10, 1);
        Pizza p3 = new Pizza("Especial", 35, 1);

        ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
        pizzaList.add(p1);
        pizzaList.add(p2);
        pizzaList.add(p3);

        for (Pizza pizza : pizzaList) {
            System.out.println(pizza.getNombre());
            System.out.println(pizza.getPrecio());
            System.out.println(pizza.getCantidad());
        }

    }
}
