package proyectopizzeria;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facturas")
public class Factura implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name="Total")
    private int total;
    @Column(name="Fecha")
    private String fecha;
    @Column(name="Resumen")
    private Pizza[] pizza;

    public Factura() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Pizza[] getPizza() {
        return pizza;
    }

    public void setPizza(Pizza[] pizza) {
        this.pizza = pizza;
    }

}
