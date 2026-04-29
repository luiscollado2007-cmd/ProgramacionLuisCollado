package accesobd.ejercicioventas;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    public static final String PROP_DB_USER = "db.user";
    public static final String PROP_DB_PASS = "db.pass";
    public static final String PROP_DB_URL = "jdbc:mysql://localhost:3306/daw_tienda";
    private Connection conexion;

    public DatabaseManager(){

    }

    public Connection abrirConexion() throws IOException {
        String usuario = PropiedadesProyecto.obtenerPropiedad(PROP_DB_USER);
        String pass = PropiedadesProyecto.obtenerPropiedad(PROP_DB_PASS);
        String url = PropiedadesProyecto.obtenerPropiedad(PROP_DB_URL);
        if (usuario == null || pass == null || url == null){
            System.out.println("aaa");
        }
        try {
            return DriverManager.getConnection(url,usuario,pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
