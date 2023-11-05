package proyectopizzeria.persistence;

import proyectopizzeria.Factura;

/**
 *
 * @author agustin
 */
public class PersistenceController {

    FacturaJpaController facturaJpaController = new FacturaJpaController();

    public Boolean addFactura(Factura factura) {
        if (factura.getTotal() != 0 && factura.getFecha() != null && factura.getResumen() != null) {
            facturaJpaController.create(factura);
            return true;
        } else {
            return false;
        }
    }
    
}
