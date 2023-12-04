import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Producto {
    private String nombre;
    private double precioVenta;
    private double precioCoste;
    private Vendedor vendedor;

    public Producto(String nombre, double precioVenta, double precioCoste, Vendedor vendedor) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCoste = precioCoste;
        this.vendedor = vendedor;
    }

    public double calcularBeneficio() {
        return precioVenta - precioCoste;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public double getPrecioCoste() {
        return precioCoste;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
}
