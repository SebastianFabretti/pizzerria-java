package proyectopizzeria;

import proyectopizzeria.persistence.FacturaJpaController;
import proyectopizzeria.persistence.PersistenceController;

public class ProyectoPizzeria {

    public static void main(String[] args) {
        tablaMenu menu = new tablaMenu();
        menu.setVisible(true);
        Factura factura = new Factura();
        factura.setFecha("10/10/2023");
        factura.setTotal(300);
        

      PersistenceController persistController= new PersistenceController();
      persistController.addFactura(factura);

      
    }
}
