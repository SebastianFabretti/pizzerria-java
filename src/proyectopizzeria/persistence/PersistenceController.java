package proyectopizzeria.persistence;

import java.util.ArrayList;
import java.util.List;
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

}
