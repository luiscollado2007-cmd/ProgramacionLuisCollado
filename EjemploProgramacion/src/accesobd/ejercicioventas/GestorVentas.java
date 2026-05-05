package accesobd.ejercicioventas;

import accesobd.ejercicioventas.modelo.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene la funcionalidad para leer, escribir, etc.. en la BD
 */
public class GestorVentas {

    private DatabaseManager managerDb;

    public GestorVentas() {
        managerDb = new DatabaseManager();
    }

    public List<Producto> obtenerProductos(){

        List<Producto> productos = new ArrayList<>();

        Connection conexion = null;
        try {
            conexion = managerDb.abrirConexion();
            PreparedStatement sentenciaPreparada = conexion.prepareStatement("SELECT * FROM productos");
            ResultSet resultados = sentenciaPreparada.executeQuery();
            while(resultados.next()){
                int id = resultados.getInt("id");
                String nombre = resultados.getString("nombre");
                String desc = resultados.getString("descripcion");
                double precio = resultados.getDouble("precio");

                Producto prod = new Producto(id, nombre, desc, precio);
                productos.add(prod);
            }

            managerDb.cerrarConexion();

        } catch (SQLException e) {
            System.err.println("No hemos podido consultar productos: " + e);
        } catch (GeneralErrorException e) {
            System.err.println("Error desconocido al consultar productos: " + e);
        }


        return productos;
    }
}