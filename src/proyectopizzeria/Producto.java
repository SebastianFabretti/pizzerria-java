package proyectopizzeria;

/**
 *
 * @author agustin
 */
public class Producto {
    private String nombre;
    private int precio;
    private int cantidad;
    
    @Override
    public String toString() {
        return "+" + nombre +" X"+ cantidad + " $" + precio + "c/u " ;
    } 
}
