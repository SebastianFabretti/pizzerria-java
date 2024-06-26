package proyectopizzeria.persistence;

import java.util.ArrayList;
import java.util.List;
import proyectopizzeria.Factura;
import proyectopizzeria.Pizza;

/**
 *
 * @author agustin
 */
public class PersistenceController {

    FacturaJpaController facturaJpaController = new FacturaJpaController();
    PizzaJpaController pizzaJpaController = new PizzaJpaController();

    public void addFactura(Factura factura) {
        facturaJpaController.create(factura);
    }

    public Factura getFactura(int id) {
        return facturaJpaController.findFactura(id);
    }

    public Factura getUltimaFactura() {
        Factura factura = new Factura();
        List<Factura> fac = new ArrayList<>();
        fac = facturaJpaController.findFacturaEntities();
        factura = fac.get(fac.size() - 1);

        return factura;
    }

    public void editPizza(Pizza pizza) throws Exception {
        pizzaJpaController.edit(pizza);
    }

    public void limpiarPedido() throws Exception {
        List<Pizza> pizzas = this.getPizzas();

        for (Pizza p : pizzas) {
            p.setCantidad(0);
            pizzaJpaController.edit(p);
        }
    }

    public List<Pizza> getPizzas() {
        List<Pizza> p = pizzaJpaController.findPizzaEntities();
        List<Pizza> pizzas = new ArrayList<>();
        for (Pizza pizza : p) {
            if (pizza.getCantidad() != 0) {
                pizzas.add(pizza);
            }
        }

        return pizzas;
    }

    public Pizza getPizza(int id) {
        return pizzaJpaController.findPizza(id);
    }

    public Pizza getPizzaByName(String nombre) {
        List<Pizza> pizzas = pizzaJpaController.findPizzaEntities();
        int id = 0;
        for(Pizza pizza : pizzas) {
            if (pizza.getNombre().equals(nombre)) {
                id = pizza.getId();
            }
        }
        return pizzaJpaController.findPizza(id);
    }

}
