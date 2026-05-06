package accesobd.ejercicioventas;

import accesobd.ejercicioventas.modelo.Cliente;
import accesobd.ejercicioventas.modelo.Producto;
import accesobd.ejercicioventas.modelo.Venta;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ProgramaVentas {

    static GestorVentas gestor;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        gestor = new GestorVentas();

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Mostrar ventas");
            System.out.println("4. Insertar producto");
            System.out.println("5. Insertar cliente");
            System.out.println("6. Insertar venta");
            System.out.println("7. Relacion de Ventas por Producto");
            System.out.println("8. Exportar relacion de Ventas por Producto");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> mostrarProductos();
                case 2 -> mostrarClientes();
                case 3 -> mostrarVentas();

                case 4 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Descripcion: ");
                    String descripcion = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    insertarProducto(nombre, descripcion, precio);
                }

                case 5 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Direccion: ");
                    String direccion = sc.nextLine();

                    System.out.print("Telefono: ");
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
                case 7 ->{
                    Map<String, Integer> ventasPorProducto = gestor.consultarVentasPorProducto();
                    Set<Map.Entry<String, Integer>> entradasMapa = ventasPorProducto.entrySet();

                    System.out.println("Relación de ventas por producto: ");
                    System.out.println("__________________________");
                    for(Map.Entry<String, Integer> entrada: entradasMapa){
                        System.out.println("| " + entrada.getKey() + " : " + entrada.getValue() + " |");
                    }
                    System.out.println("__________________________");


                }
                case 8 ->{
                    Map<String, Integer> ventasPorProducto = gestor.consultarVentasPorProducto();
                    GestorFicheros.volcarVentasPorProducto(ventasPorProducto);

                }


                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida");
            }

        } while (opcion != 0);

        sc.close();
    }

    private static void insertarProducto(String nombre, String descripcion, double precio) {
        boolean insertado = gestor.insertarProducto(nombre, descripcion, precio);
        if (insertado) {
            System.out.println("Producto insertado correctamente");
        }
    }

    private static void insertarCliente(String nombre, String direccion, String telefono) {
        boolean insertado = gestor.insertarCliente(nombre, direccion, telefono);
        if (insertado) {
            System.out.println("Cliente insertado correctamente");
        }
    }

    private static void insertarVenta(int clienteId, int productoId, int cantidad, String fecha) {
        try {
            LocalDate fechaVenta = LocalDate.parse(fecha);
            boolean insertado = gestor.insertarVenta(clienteId, productoId, cantidad, fechaVenta);
            if (insertado) {
                System.out.println("Venta insertada correctamente");
            }
        } catch (DateTimeParseException e) {
            System.err.println("La fecha debe tener el formato YYYY-MM-DD");
        }
    }

    private static void mostrarVentas() {
        List<Venta> ventas = gestor.obtenerVentas();
        System.out.println("**** LISTA DE VENTAS. TOTAL: " + ventas.size() + " *****");
        for (Venta v : ventas) {
            System.out.printf("ID: %d | Cliente: %s | Producto: %s | Cantidad: %d | Fecha: %s",
                    v.getId(), v.getNombreCliente(), v.getNombreProducto(), v.getCantidad(), v.getFechaVenta());
            System.out.println();
        }
    }

    private static void mostrarClientes() {
        List<Cliente> clientes = gestor.obtenerClientes();
        System.out.println("**** LISTA DE CLIENTES. TOTAL: " + clientes.size() + " *****");
        for (Cliente c : clientes) {
            System.out.printf("ID: %d | Nombre: %s | Direccion: %s | Telefono: %s",
                    c.getId(), c.getNombre(), c.getDireccion(), c.getTelefono());
            System.out.println();
        }
    }

    private static void mostrarProductos() {

        List<Producto> productos = gestor.obtenerProductos();
        System.out.println("**** LISTA DE PRODUCTOS. TOTAL: " + productos.size() + " *****");
        for (Producto p : productos) {
            System.out.printf("ID: %d | Nombre: %s | Descripcion: %s | Precio: %.2f",
                    p.getId(), p.getNombre(), p.getDescripcion(), p.getPrecio());
            System.out.println();
        }
    }
}