package accesobd.ejercicioventas;

import accesobd.ejercicioventas.modelo.Producto;

import java.util.List;
import java.util.Scanner;

public class ProgramaVentas {

    static GestorVentas gestor;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        gestor = new GestorVentas();

        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Mostrar ventas");
            System.out.println("4. Insertar producto");
            System.out.println("5. Insertar cliente");
            System.out.println("6. Insertar venta");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> mostrarProductos();
                case 2 -> mostrarClientes();
                case 3 -> mostrarVentas();

                case 4 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    insertarProducto(nombre, descripcion, precio);
                }

                case 5 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();

                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();

                    insertarCliente(nombre, direccion, telefono);
                }

                case 6 -> {
                    System.out.print("ID cliente: ");
                    int clienteId = sc.nextInt();

                    System.out.print("ID producto: ");
                    int productoId = sc.nextInt();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Fecha (YYYY-MM-DD): ");
                    String fecha = sc.nextLine();

                    insertarVenta(clienteId, productoId, cantidad, fecha);
                }

                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }

    private static void insertarProducto(String nombre, String descripcion, double precio) {
    }

    private static void insertarCliente(String nombre, String direccion, String telefono) {
    }

    private static void insertarVenta(int clienteId, int productoId, int cantidad, String fecha) {
    }

    private static void mostrarVentas() {


    }

    private static void mostrarClientes() {
    }

    private static void mostrarProductos() {

        List<Producto> productos = gestor.obtenerProductos();
        System.out.println("**** LISTA DE PRODUCTOS. TOTAL: " + productos.size() + " *****");
        for (Producto p : productos) {
            System.out.printf("ID: %d | Nombre: %s | Descripcion: %s | Precio: %f", p.getId(), p.getNombre(), p.getDescripcion(), p.getPrecio());
            System.out.println();
        }
    }

}