package accesobd.ejercicioventas;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    public static final String PROP_DB_USER = "db.user";
    public static final String PROP_DB_URL = "db.url";
    public static final String PROP_DB_PASS = "db.pass";
    private Connection conexion;

    public DatabaseManager(){

    }

    public Connection abrirConexion() throws SQLException, GeneralErrorException {
        String url = null;
        try {
            url = PropiedadesProyecto.obtenerPropiedad(PROP_DB_URL);
            String usuario = PropiedadesProyecto.obtenerPropiedad(PROP_DB_USER);
            String pass = PropiedadesProyecto.obtenerPropiedad(PROP_DB_PASS);
            conexion = DriverManager.getConnection(url, usuario, pass);
        } catch (IOException e) {
            throw new GeneralErrorException("Error al obtener propiedades del proyecto. No se puede abrir conexion");
        }
        return conexion;
    }

    public void cerrarConexion() throws SQLException {
        if(conexion != null && !conexion.isClosed()){
            conexion.close();
        }
    }

}