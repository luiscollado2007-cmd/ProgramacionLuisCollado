package accesobd.ejercicioventas;

import accesobd.ejercicioventas.modelo.Cliente;
import accesobd.ejercicioventas.modelo.Producto;
import accesobd.ejercicioventas.modelo.Venta;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;

/**
 * Clase que contiene la funcionalidad para leer, escribir, etc.. en la BD
 */
public class GestorVentas {

    private final DatabaseManager managerDb;

    public GestorVentas() {
        managerDb = new DatabaseManager();
    }

    public List<Producto> obtenerProductos() {

        List<Producto> productos = new ArrayList<>();

        try (Connection conexion = managerDb.abrirConexion();
             PreparedStatement sentenciaPreparada = conexion.prepareStatement("SELECT id, nombre, descripcion, precio FROM productos");
             ResultSet resultados = sentenciaPreparada.executeQuery()) {

            while (resultados.next()) {
                int id = resultados.getInt("id");
                String nombre = resultados.getString("nombre");
                String desc = resultados.getString("descripcion");
                double precio = resultados.getDouble("precio");

                Producto prod = new Producto(id, nombre, desc, precio);
                productos.add(prod);
            }

        } catch (SQLException e) {
            System.err.println("No hemos podido consultar productos: " + e.getMessage());
        } catch (GeneralErrorException e) {
            System.err.println("Error al consultar productos: " + e.getMessage());
        }

        return productos;
    }

    public List<Cliente> obtenerClientes() {

        List<Cliente> clientes = new ArrayList<>();

        try (Connection conexion = managerDb.abrirConexion();
             PreparedStatement sentenciaPreparada = conexion.prepareStatement("SELECT id, nombre, direccion, telefono FROM clientes");
             ResultSet resultados = sentenciaPreparada.executeQuery()) {

            while (resultados.next()) {
                int id = resultados.getInt("id");
                String nombre = resultados.getString("nombre");
                String direccion = resultados.getString("direccion");
                String telefono = resultados.getString("telefono");

                Cliente cliente = new Cliente(id, nombre, direccion, telefono);
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            System.err.println("No hemos podido consultar clientes: " + e.getMessage());
        } catch (GeneralErrorException e) {
            System.err.println("Error al consultar clientes: " + e.getMessage());
        }

        return clientes;
    }

    public List<Venta> obtenerVentas() {

        List<Venta> ventas = new ArrayList<>();

        String consulta = """
                SELECT v.id, c.nombre AS nombre_cliente, p.nombre AS nombre_producto, v.cantidad, v.fecha_venta
                FROM ventas v
                INNER JOIN clientes c ON v.cliente_id = c.id
                INNER JOIN productos p ON v.producto_id = p.id
                ORDER BY v.fecha_venta, v.id
                """;

        try (Connection conexion = managerDb.abrirConexion();
             PreparedStatement sentenciaPreparada = conexion.prepareStatement(consulta);
             ResultSet resultados = sentenciaPreparada.executeQuery()) {

            while (resultados.next()) {
                int id = resultados.getInt("id");
                String nombreCliente = resultados.getString("nombre_cliente");
                String nombreProducto = resultados.getString("nombre_producto");
                int cantidad = resultados.getInt("cantidad");
                LocalDate fechaVenta = resultados.getDate("fecha_venta").toLocalDate();

                Venta venta = new Venta(id, nombreCliente, nombreProducto, cantidad, fechaVenta);
                ventas.add(venta);
            }

        } catch (SQLException e) {
            System.err.println("No hemos podido consultar ventas: " + e.getMessage());
        } catch (GeneralErrorException e) {
            System.err.println("Error al consultar ventas: " + e.getMessage());
        }

        return ventas;
    }

    public boolean insertarProducto(String nombre, String descripcion, double precio) {

        String insercion = "INSERT INTO productos(nombre, descripcion, precio) VALUES(?, ?, ?)";

        try (Connection conexion = managerDb.abrirConexion();
             PreparedStatement sentenciaPreparada = conexion.prepareStatement(insercion)) {

            sentenciaPreparada.setString(1, nombre);
            sentenciaPreparada.setString(2, descripcion);
            sentenciaPreparada.setDouble(3, precio);

            int filasInsertadas = sentenciaPreparada.executeUpdate();
            return filasInsertadas == 1;

        } catch (SQLException e) {
            System.err.println("No hemos podido insertar el producto: " + e.getMessage());
        } catch (GeneralErrorException e) {
            System.err.println("Error al insertar el producto: " + e.getMessage());
        }

        return false;
    }

    public boolean insertarCliente(String nombre, String direccion, String telefono) {

        String insercion = "INSERT INTO clientes(nombre, direccion, telefono) VALUES(?, ?, ?)";

        try (Connection conexion = managerDb.abrirConexion();
             PreparedStatement sentenciaPreparada = conexion.prepareStatement(insercion)) {

            sentenciaPreparada.setString(1, nombre);
            sentenciaPreparada.setString(2, direccion);
            sentenciaPreparada.setString(3, telefono);

            int filasInsertadas = sentenciaPreparada.executeUpdate();
            return filasInsertadas == 1;

        } catch (SQLException e) {
            System.err.println("No hemos podido insertar el cliente: " + e.getMessage());
        } catch (GeneralErrorException e) {
            System.err.println("Error al insertar el cliente: " + e.getMessage());
        }

        return false;
    }

    public boolean insertarVenta(int clienteId, int productoId, int cantidad, LocalDate fechaVenta) {

        String insercion = "INSERT INTO ventas(cliente_id, producto_id, cantidad, fecha_venta) VALUES(?, ?, ?, ?)";

        try (Connection conexion = managerDb.abrirConexion();
             PreparedStatement sentenciaPreparada = conexion.prepareStatement(insercion)) {

            sentenciaPreparada.setInt(1, clienteId);
            sentenciaPreparada.setInt(2, productoId);
            sentenciaPreparada.setInt(3, cantidad);
            sentenciaPreparada.setDate(4, Date.valueOf(fechaVenta));

            int filasInsertadas = sentenciaPreparada.executeUpdate();
            return filasInsertadas == 1;

        } catch (SQLException e) {
            System.err.println("No hemos podido insertar la venta: " + e.getMessage());
        } catch (GeneralErrorException e) {
            System.err.println("Error al insertar la venta: " + e.getMessage());
        }

        return false;
    }

    public Map<String, Integer> consultarVentasPorProducto(){

        Map<String, Integer> mapaVentasPorProducto = new HashMap<>();

        //cojo las ventas de la BD
        List<Venta> ventas = this.obtenerVentas();
        //recorro las ventas.
        for(Venta unaVenta: ventas){
            String nombreProducto = unaVenta.getNombreProducto();

            Integer ventasTotalesProducto;
            //si existe, actualizo su valor con la cantidad de la venta. Si no existe, le pongo la cantidad de la venta
            ventasTotalesProducto = mapaVentasPorProducto.getOrDefault(nombreProducto, 0);
            ventasTotalesProducto += unaVenta.getCantidad();
            //meter en el mapa el valor resultante para ese nombre
            mapaVentasPorProducto.put(nombreProducto, ventasTotalesProducto);

        }

        return mapaVentasPorProducto;
    }
}