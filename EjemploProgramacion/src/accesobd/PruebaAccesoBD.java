package accesobd;

import java.sql.*;

public class PruebaAccesoBD {

    public static void main(String[] args) {
        //jdbc:mysql://localhost:3306/?user=root

        try {
            Connection conexion = DriverManager.getConnection(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);


            System.out.println("Conexión exitosa");

            Statement sentencia = conexion.createStatement();
            int numFilasAfectadas = sentencia.executeUpdate("INSERT INTO categorias(nombre) values('Servidores')");
            System.out.println("Categoría insertada. Número de filas afectadas: " + numFilasAfectadas);

            sentencia.close();


            conexion.close();
        }catch (SQLSyntaxErrorException e){
            System.err.println("Algún error en la sintaxis al lanzar la inserción: " + e);
        } catch (SQLException e) {
            System.err.println("Error al conectar con la BD: " + e);
        }
    }
}
