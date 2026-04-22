package accesobd;

import java.sql.*;

public class PruebaTryResources {

    public static void main(String[] args) {
        //jdbc:mysql://localhost:3306/?user=root
        Connection conexion = null;
        Statement sentencia = null;
        try {
            conexion = DriverManager.getConnection(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);


            System.out.println("Conexión exitosa");

            sentencia = conexion.createStatement();
            int numFilasAfectadas = sentencia.executeUpdate("INSERT INTO categorias(nombre) values('Servidores')");
            System.out.println("Categoría insertada. Número de filas afectadas: " + numFilasAfectadas);


        }catch (SQLSyntaxErrorException e){
            System.err.println("Algún error en la sintaxis al lanzar la inserción: " + e);
        } catch (SQLException e) {
            System.err.println("Error al conectar con la BD: " + e);
        }finally {
            try {
                if (sentencia != null){
                    sentencia.close();
                }
                if (conexion != null){
                   conexion.close();
                }
            }catch (SQLException e){
                System.err.println("Error al cerrar objetos de conexión: " + e);
            }


        }
    }
}
