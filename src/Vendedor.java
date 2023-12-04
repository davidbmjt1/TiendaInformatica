import java.util.ArrayList;
import java.util.List;

class Vendedor {
    private String nombre;
    private List<Producto> productosVendidos;

    public Vendedor(String nombre) {
        this.nombre = nombre;
        this.productosVendidos = new ArrayList<>();
    }

    public void venderProducto(Producto producto) {
        productosVendidos.add(producto);
    }

    public double calcularTotalVentas() {
        return productosVendidos.stream()
                .mapToDouble(Producto::getPrecioVenta)
                .sum();
    }

    public String getNombre() {
        return nombre;
    }
}
