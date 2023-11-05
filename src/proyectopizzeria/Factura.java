package proyectopizzeria;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="facturas")
public class Factura implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name="Total")
    private int total;
    @Column(name="Resumen")
    private String resumen;
    @Column(name="Fecha")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fecha;

    public Factura() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String pizza) {
        this.resumen = pizza;
    }
}
