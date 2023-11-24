import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Producto ordenador = new Producto(
                "ordenador",
                400,
                800,
                10
        );

        Producto impresora = new Producto(
                "impresora",
                100,
                200,
                3
        );


        Producto monitor = new Producto(
                "monitor",
                75,
                150,
                5
        );




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

        /*
        cuentaDeJuan.nombreTitular = "Juan Pérez";
        cuentaDeJuan.numCuenta = "11111";
        cuentaDeJuan.saldo = 30_000;
        */
//        System.out.println(cuentaDeJuan);



        /*
        // solución alternativa con while (semáforo)
        boolean mostrarMenu = true;
        while (mostrarMenu ) {
            System.out.println(menu);
            eleccion = input.nextShort();

            switch (eleccion) {
                case 1:
                    System.out.println(cuentaDeJuan);
                    break;
                case 2:
                    // retirada de dinero
                    System.out.println("\n¿Qué cantidad desea retirar?");
                    double fondosRetirada = input.nextDouble();
                    cuentaDeJuan.retirarFondos(fondosRetirada);
                    break;
                case 3:
                    // ingresar de dinero
                    System.out.println("\n¿Qué cantidad desea ingresar?");
                    double fondosIngreso = input.nextDouble();
                    cuentaDeJuan.ingresarFondos(fondosIngreso);
                    break;
                default:
                    System.out.println("Muchas gracias y hasta pronto");
                    mostrarMenu = false;
            }

        }
        */



    }

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


}