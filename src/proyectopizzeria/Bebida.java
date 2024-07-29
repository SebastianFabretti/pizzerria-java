package proyectopizzeria;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author agustin
 */
@Entity
@Table(name = "bebidas")
public class Bebida extends Producto implements Serializable{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio")
    private int precio;
    @Column(name = "cantidad")
    private int cantidad;

    public Bebida() {}

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int calcularTotal() {
        return this.cantidad * this.precio;
    }

    @Override
    public String toString() {
        return "+" + nombre + " X" + cantidad + " $" + precio + "c/u ";
    }
    
}
