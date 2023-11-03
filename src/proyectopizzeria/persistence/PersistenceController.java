package proyectopizzeria.persistence;

import proyectopizzeria.Factura;

/**
 *
 * @author agustin
 */
public class PersistenceController {
    
    FacturaJpaController facturaJpaController = new FacturaJpaController();
    
    public void addFactura(Factura factura) {
        facturaJpaController.create(factura);
    }
}
