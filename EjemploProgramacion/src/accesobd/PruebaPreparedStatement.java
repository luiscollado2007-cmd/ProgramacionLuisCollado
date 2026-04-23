package accesobd;

import java.sql.*;
import java.util.Scanner;

public class PruebaPreparedStatement {

    public static void main(String[] args) {
        System.out.println("Vamos a insertar un nuevo producto.");
        System.out.println("Dime el nombre del producto");
        Scanner teclado = new Scanner(
                System.in
        );
        String nombreProducto = teclado.nextLine();

        System.out.println("Dime el precio del producto");
        double precioProducto = teclado.nextDouble();

        System.out.println("Dime el stock del producto");
        int stockProducto = teclado.nextInt();

        //Metemos dentro del try, los elementos que se "abren" y que
        //se cerrarán cuando termine el bloque try-catch
        try(Connection conexion = DriverManager.getConnection(
                ConstantesBD.URL,
                ConstantesBD.USER,
                ConstantesBD.PASS);
            PreparedStatement sentencia = conexion.prepareStatement(
                    "INSERT INTO productos(nombre, precio, stock, activo, id_categoria) VALUES(?, ?, ?, ?, ?)")){

            System.out.println("Conexión exitosa");

            sentencia.setString(1, nombreProducto);
            sentencia.setDouble(2, precioProducto);
            sentencia.setInt(3, stockProducto);
            sentencia.setInt(4, 1);
            sentencia.setInt(5, 1);

            int numFilasAfectadas = sentencia.executeUpdate();

            System.out.println("Numero de filas afectadas: " + numFilasAfectadas);
            if(numFilasAfectadas > 0){
                System.out.println("Producto insertado");
            }else{
                System.out.println("Algo ha pachao");
            }

        }catch (SQLSyntaxErrorException e){
            System.err.println("Algun error en la sintaxis al lanzar la sentencia: " + e);
        } catch (SQLException e) {
            System.err.println("Error al conectar con la BD: " + e);
        }

    }
}
