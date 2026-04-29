package accesobd.ejercicioventas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropiedadesProyecto {

    private static Properties props;

    private static void cargaProperties() throws IOException {
        //TODO: cargar el fichero de properties con la ruta del fichero de properties
        Path rutaFichProperties = Paths.get(ConstantesGenerales.RUTA_FICH_PROPERTIES);
        props = new Properties();
        props.load(Files.newInputStream(rutaFichProperties));
    }


    public static String obtenerPropiedad(String prop) throws IOException {
        //si el atributo props es nulo, llamamos a cargaProperties
        if (props == null){
            cargaProperties();
        }
        //si no, consultamos la propiedad y devolvemos el valor
        return props.getProperty(prop);
    }

    public static boolean obtenerPropiedadBoolean(String prop) throws IOException {
        if (props == null){
            cargaProperties();
        }
        return Boolean.parseBoolean(props.getProperty(prop));
    }
}
