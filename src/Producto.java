public class Producto {
    String nombreProducto;
    double costeUnitario;
    double precioUnitarioVenta;
    int unidadesVendidas;
    String vendedor;


    public Producto (String nombreProducto, double costeUnitario, double precioUnitarioVenta, int unidadesVendidas, String vendedor) {
        this.nombreProducto = nombreProducto;
        this.costeUnitario = costeUnitario;
        this.precioUnitarioVenta = precioUnitarioVenta;
        this.unidadesVendidas = unidadesVendidas;
        this.vendedor = vendedor;
    }


    public void ventaProducto (int cantidad) {
        unidadesVendidas = unidadesVendidas + cantidad;
    }

    public void obtenerBeneficiosPerdidas (String nombreProducto) {

    }

    public void calcularVendedorLider (String nombreProducto) {

    }

    public void calcularProductoLider (String nombreProducto) {

    }

}