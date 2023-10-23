package proyectopizzeria;

import java.util.Date;

public class Factura {
    private int id;
    private Date fecha;
    private int total;
    private Pizza[] pizza;

    public Factura(int id, Date fecha, int total, Pizza[] pizza) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.pizza = pizza;
    }

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

    public Pizza[] getPizza() {
        return pizza;
    }

    public void setPizza(Pizza[] pizza) {
        this.pizza = pizza;
    }
    
    
}
