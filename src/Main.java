import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Tienda tienda = new Tienda();


        Vendedor vendedor1 = new Vendedor("Juan");
        Vendedor vendedor2 = new Vendedor("Maria");

        Producto producto1 = new Producto("Laptop", 1200.0, 800.0, vendedor1);
        Producto producto2 = new Producto("Impresora", 300.0, 150.0, vendedor2);
        Producto producto3 = new Producto("Monitor", 500.0, 300.0, vendedor1);

        vendedor1.venderProducto(producto1);
        vendedor2.venderProducto(producto2);
        vendedor1.venderProducto(producto3);


        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);



        boolean gestion = true;
        do {
            String menu = """
                    1 - Comprar producto
                    2 - Mejor vendedor
                    3 - Mejor producto
                    """;

            System.out.println(menu);
            String opcion = input.next();

            switch (opcion) {
                case "1":
                    comprarProducto(input, tienda);
                    break;
                case "2":
                    Vendedor mejorVendedor = tienda.obtenerMejorVendedor();
                    System.out.println("Mejor Vendedor: " + mejorVendedor.getNombre());
                    break;
                case "3":
                    Producto productoMasRentable = tienda.obtenerProductoMasRentable();
                    System.out.println("Producto Más Rentable: " + productoMasRentable.getNombre());
                    break;
                default:
                    gestion = false;

            }
        } while (gestion);



    }

    private static void comprarProducto(Scanner input, Tienda tienda) {
        System.out.println("¿Nombre del producto?");
        String nombreProducto = input.next();
        System.out.println("¿Precio de venta?");
        double precioVenta = input.nextDouble();
        System.out.println("¿Precio de coste?");
        double precioCoste = input.nextDouble();
        System.out.println("¿Nombre del vendedor?");
        String nombreVendedor = input.next();

        Vendedor vendedor = new Vendedor(nombreVendedor);
        Producto producto = new Producto(nombreProducto, precioVenta, precioCoste, vendedor);
        vendedor.venderProducto(producto);
        tienda.agregarProducto(producto);
    }
}

