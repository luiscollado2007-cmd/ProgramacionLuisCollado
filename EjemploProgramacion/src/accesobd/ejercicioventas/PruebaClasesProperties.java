package accesobd.ejercicioventas;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class PruebaClasesProperties {

    public static void main(String[] args) {


        try {
            String usuario = PropiedadesProyecto.obtenerPropiedad("db.user");
            System.out.println("usuario = " + usuario);
            String pass = PropiedadesProyecto.obtenerPropiedad("db.pass");
            System.out.println("pass = " + pass);

            boolean status = PropiedadesProyecto.obtenerPropiedadBoolean("enable-status");
            System.out.println("status = " + status);
        }catch (NoSuchFileException e){
            System.err.println("No existe ningún fichero de properties con ese nombre: " + e);
        } catch (IOException e) {
            System.err.println("Ha ocurrido un problema al cargar las properties: " + e);
        }
    }
}
