package accesobd;

import java.sql.*;

public class PruebaNuevaColumnaBD {

    public static void main(String[] args) {

        try {
            Connection conexion = DriverManager.getConnection(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);


            System.out.println("Conexión exitosa");

            Statement sentencia = conexion.createStatement();
            boolean exito = sentencia.execute("Alter table categorias add column oferta tinyint null");
            System.out.println("Nueva columna creada. Éxito: " + exito);

            sentencia.close();


            conexion.close();
        }catch (SQLSyntaxErrorException e){
            System.err.println("Algún error en la sintaxis al lanzar la inserción: " + e);
        } catch (SQLException e) {
            System.err.println("Error al conectar con la BD: " + e);
        }
    }
}
