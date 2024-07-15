package proyectopizzeria.persistence;

import java.util.ArrayList;
import java.util.List;
import proyectopizzeria.Bebida;
import proyectopizzeria.Factura;
import proyectopizzeria.Pizza;
import proyectopizzeria.Producto;

/**
 *
 * @author agustin
 */
public class PersistenceController {

    FacturaJpaController facturaJpaController = new FacturaJpaController();
    PizzaJpaController pizzaJpaController = new PizzaJpaController();
    BebidaJpaController bebidaJpaController = new BebidaJpaController();

    // Facturas    
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

    // Pizzas
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

    public List<Pizza> getAllPizzas() {
        return pizzaJpaController.findPizzaEntities();
    }

    public Pizza getPizza(int id) {
        return pizzaJpaController.findPizza(id);
    }

    public Pizza getPizzaByName(String nombre) {
        List<Pizza> pizzas = pizzaJpaController.findPizzaEntities();
        int id = 0;
        for (Pizza pizza : pizzas) {
            if (pizza.getNombre().equals(nombre)) {
                id = pizza.getId();
            }
        }
        return pizzaJpaController.findPizza(id);
    }

    // Bebidas
    public void editBebida(Bebida bebida) throws Exception {
        bebidaJpaController.edit(bebida);
    }

    public List<Bebida> getBebidas() {
        List<Bebida> p = bebidaJpaController.findBebidaEntities();
        List<Bebida> bebidas = new ArrayList<>();
        for (Bebida bebida : p) {
            if (bebida.getCantidad() != 0) {
                bebidas.add(bebida);
            }
        }

        return bebidas;
    }

    public List<Bebida> getAllBebidas() {
        return bebidaJpaController.findBebidaEntities();
    }

    public Bebida getBebida(int id) {
        return bebidaJpaController.findBebida(id);
    }

    public Bebida getBebidaByName(String nombre) {
        List<Bebida> bebidas = bebidaJpaController.findBebidaEntities();
        int id = 0;
        for (Bebida bebida : bebidas) {
            if (bebida.getNombre().equals(nombre)) {
                id = bebida.getId();
            }
        }
        return bebidaJpaController.findBebida(id);
    }

    // Pizzas y Bebidas
    public void limpiarPedido() throws Exception {
        List<Pizza> pizzas = this.getPizzas();

        for (Pizza p : pizzas) {
            p.setCantidad(0);
            pizzaJpaController.edit(p);
        }

        List<Bebida> bebidas = this.getBebidas();

        for (Bebida b : bebidas) {
            b.setCantidad(0);
            bebidaJpaController.edit(b);
        }
    }

    public List<Producto> getPedidoFinal() {
        List<Producto> productos = new ArrayList<>();
        List<Pizza> pizzas = getPizzas();
        List<Bebida> bebidas = getBebidas();

        for (Pizza p : pizzas) {
            productos.add(p);
        }
        for (Bebida b : bebidas) {
            productos.add(b);
        }

        return productos;
    }

}
