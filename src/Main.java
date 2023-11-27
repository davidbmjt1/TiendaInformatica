import java.util.ArrayList;
import java.util.Scanner;

//import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tienda informática");

        Scanner input = new Scanner(System.in);
        ArrayList<Ventas> ventas = new ArrayList<>();

        boolean continuar_programa = true;

        do {

            String menu = """
                    1 - Introducir venta
                    2 - Mostrar todas las ventas
                    3 - Mostrar beneficio actual
                    4 - Producto con mayor beneficio
                                        
                    6 - Vendedor líder
                    7 - Producto líder
                         """;

            System.out.println(menu);

            int opcion = input.nextInt();


            switch (opcion) {
                case 1:
                    crearVenta(input, ventas);
                    break;


                case 2:
                    for (int i = 0; i < ventas.size(); i++) {
                        System.out.println(ventas.get(i));
                    }
                    break;

                case 3:
                    float total = 0;
                    for (int i = 0; i < ventas.size(); i++) {
                        total += ventas.get(i).getBeneficio_venta();
                    }
                    System.out.println("Beneficio actual:" + total + "€");
                    break;


                default:
                    System.out.println("Opción no reconocida");
                    continuar_programa = false;

            }


            //Ventas venta1 = new Ventas("portátil", 2, 500, 300, "Bill Gates");
            //Ventas venta2 = new Ventas("monitor", 5, 250, 180, "Elon Musk");


            //////ventas.add(venta1);
            //////ventas.add(venta2);


            /*
            for (int i = 0; i < ventas.size(); i++) {
                //System.out.println();
                System.out.println(ventas.get(i)); // + nuestras_ventas.get(i));
                System.out.println("El beneficio ha sido ");

            }
*/

            //System.out.println(venta1);
            //////System.out.println("Beneficio venta #1: " + beneficio_venta1);



/*
            System.out.println("Por favor, indique su nombre (vendedor):");
            String nombreVendedor = input.next();

            switch (nombreVendedor){
                case "Juan":
                    actuacionVendedor("Juan", input);
                    break;
                case "Bill":
                    actuacionVendedor("Bill", input);
                    break;
                case "Elon":
                    actuacionVendedor("Elon", input);
                    break;
                default:
                    System.out.println("Error en la identificación");
            }
*/


        } while (continuar_programa);

    }


        public static void crearVenta (Scanner input, ArrayList ventas) {
            System.out.println("Nombre del producto: ");
            String nombreProducto = input.next();

            System.out.println("Cantidad de unidades: ");
            int unidades = input.nextInt();

            System.out.println("Precio venta: ");
            float precioVenta = input.nextFloat();

            System.out.println("Precio coste: ");
            float precioCoste = input.nextFloat();

            System.out.println("Vendedor: ");
            String vendedor = input.next();

            /*
            for (int i = 0; i < ventas.size() ; i++) {
                if (ventas.get(i).getNombre_producto() == nombreProducto) {
                    subtotalBeneficio = ventas.get(i).get
                }
            }
            */


            Ventas venta = new Ventas(nombreProducto, unidades, precioVenta, precioCoste, vendedor);
            ventas.add(venta);



        }

        /*
        public static String obtenerBenneficios (ArrayList ventas) {
            float beneficio = 0;
            for (int i = 0; i < ventas.size(); i++) {
                beneficio +=  ventas.get(i).getBeneficio_venta();
            }
            return
        }
        */


/*

    private static void actuacionVendedor(String vendedor, Scanner input) {

        String menu = STR."""
        Bienvenido/a \{vendedor}
               Operaciones disponibles:
1 - Crear venta productos     2 - Obtener beneficios o pérdidas actuales
3 - Vendedor líder            4 - Producto líder
               Cualquier otra tecla para finalizar
               """;

        short eleccion;

        do {
            System.out.println(menu);
            eleccion = input.nextShort();

            switch (eleccion) {
                case 1:
                    System.out.println("Producto a vender: ");
                    //////Producto.ventaProducto(3);
                    break;
                case 2:
                    // retirada de dinero
                    System.out.println("\n¿Qué cantidad?");
                    double fondosRetirada = input.nextDouble();
                    //////cuentaDeAlguien.retirarFondos(fondosRetirada);
                    break;


                case 3:
                    // ingresar de dinero
                    System.out.println("\n¿Qué cantidad desea ingresar?");
                    double fondosIngreso = input.nextDouble();
                    //////cuentaDeAlguien.ingregresarFondos(fondosIngreso);
                    break;
                case 4:
                    System.out.println("indique el nombre del nuevo titular de la cuenta.");
                    String nuevoTitular = input.next();
                    //////cuentaDeAlguien.nombreTitular = nuevoTitular;
                    break;
                default:
                    System.out.println("Muchas gracias y hasta pronto");

            }

        } while (eleccion == 1 || eleccion == 2 || eleccion ==3 || eleccion ==4);

    }
*/



}


