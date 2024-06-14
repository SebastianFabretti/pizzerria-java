package proyectopizzeria;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facturas")
public class Pizza implements Serializable {
    @Id
    @Column(name="nombre")
    private String nombre;
    @Column(name="precio")
    private int precio;
    @Column(name="cantidad")
    private int cantidad;

    public Pizza() {}

    public Pizza(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return this.cantidad;
    }
    
    @Override
    public String toString() {
        return "+" + nombre +" X"+ cantidad + " $" + precio + "c/u " ;
    }
}
