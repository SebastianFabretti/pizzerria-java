package proyectopizzeria;

/**
 *
 * @author agustin
 */
public class Producto implements Calculable, Modificable {

    private String nombre;
    private int precio;
    private int cantidad;

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

    @Override
    public void agregar() {
        this.setCantidad(this.getCantidad() + 1);
    }

    @Override
    public void descontar() {
        this.setCantidad(this.getCantidad() - 1);
    }
}
