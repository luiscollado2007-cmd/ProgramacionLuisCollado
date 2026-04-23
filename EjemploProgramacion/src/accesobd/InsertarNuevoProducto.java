package accesobd;

import java.sql.*;
import java.util.Scanner;

public class InsertarNuevoProducto {

    public static void main(String[] args) {

        System.out.println("Vamos a insertar un nuevo producto.");
        System.out.println("Dime el nombre del producto");
        Scanner teclado = new Scanner(
                System.in
        );
        String nombre = teclado.nextLine();

        System.out.println("Dime el precio del producto");
        double precio = teclado.nextDouble();

        System.out.println("Dime el stock del producto");
        int stock = teclado.nextInt();

        //Metemos dentro del try, los elementos que se "abren" y que
        //se cerrarán cuando termine el bloque try-catch
        try (Connection conexion = DriverManager.getConnection(
                ConstantesBD.URL,
                ConstantesBD.USER,
                ConstantesBD.PASS);
             Statement sentencia = conexion.createStatement()) {

            System.out.println("Conexión exitosa");
            int numFilasAfectadas =
                    sentencia.executeUpdate("INSERT INTO productos(nombre, precio, stock, activo, id_categoria) " +
                            "VALUES(" + nombre + ", " + precio + ", " + stock + ", 1,1)");

            System.out.println("Numero de filas afectadas: " + numFilasAfectadas);
            if (numFilasAfectadas > 0) {
                System.out.println("Producto insertado");
            } else {
                System.out.println("Algo ha pachao");
            }

        } catch (SQLSyntaxErrorException e) {
            System.err.println("Algun error en la sintaxis al lanzar la sentencia: " + e);
        } catch (SQLException e) {
            System.err.println("Error al conectar con la BD: " + e);
        }

    }
}