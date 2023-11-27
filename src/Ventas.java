public class Ventas {
    private String nombre_producto;
    private  int cantidad_unidades;
    private float precio_venta;
    private float precio_coste;
    private String nombre_vendedor;

    private float beneficio_venta;
    private float beneficioTotalProducto;


    public Ventas(String nombre_producto, int cantidad_unidades, float precio_venta, float precio_coste, String nombre_vendedor /*, float beneficio_venta*/) {
        this.nombre_producto = nombre_producto;
        this.cantidad_unidades = cantidad_unidades;
        this.precio_venta = precio_venta;
        this.precio_coste = precio_coste;
        this.nombre_vendedor = nombre_vendedor;
        this.beneficio_venta = beneficio_unitario() * this.cantidad_unidades;
    }


    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCantidad_unidades() {
        return cantidad_unidades;
    }

    public void setCantidad_unidades(int cantidad_unidades) {
        this.cantidad_unidades = cantidad_unidades;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public float getPrecio_coste() {
        return precio_coste;
    }

    public void setPrecio_coste(float precio_coste) {
        this.precio_coste = precio_coste;
    }

    public String getNombre_vendedor() {
        return nombre_vendedor;
    }

    public void setNombre_vendedor(String nombre_vendedor) {
        this.nombre_vendedor = nombre_vendedor;
    }

    public float getBeneficio_venta() {
        return beneficio_venta;
    }

    public void setBeneficio_venta(float beneficio_venta) {
        this.beneficio_venta = beneficio_venta;
    }



    @Override
    public String toString() {
        return  "producto='" + nombre_producto + '\'' +
                ", unidades=" + cantidad_unidades +
                ", precio venta=" + precio_venta +
                ", precio coste=" + precio_coste +
                ", vendedor='" + nombre_vendedor + '\'' +
                ", beneficio venta= '" + this.beneficio_venta +
                ", beneficio total producto '" + this.beneficioTotalProducto
                ;
    }


    public float beneficio_unitario(){
        return this.precio_venta - this.precio_coste;
    }

    public float obtenerBeneficioTotal () {
        return beneficioTotalProducto += this.beneficio_venta;
    }


}
