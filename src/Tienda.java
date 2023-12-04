import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Tienda {
    private List<Producto> inventario;

    public Tienda() {
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public Vendedor obtenerMejorVendedor() {
        return inventario.stream()
                .collect(Collectors.groupingBy(Producto::getVendedor,
                        Collectors.summingDouble(Producto::getPrecioVenta)))
                .entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public Producto obtenerProductoMasRentable() {
        return inventario.stream()
                .max(Comparator.comparingDouble(Producto::calcularBeneficio))
                .orElse(null);
    }
}
