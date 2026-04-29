package accesobd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PruebaCargaProperties {

    public static void main(String[] args) {

        Properties propiedades = new Properties();
        Path rutaFicheroProperties = Paths.get("application.properties");

        if (Files.exists(rutaFicheroProperties)){
            System.out.println("Existe el fich de properties y lo veo");

            try {
                propiedades.load(Files.newInputStream(rutaFicheroProperties));
                System.out.println("Fichero de properties cargado correctamente...");

                String usuarioBD = propiedades.getProperty("db.user");
                String passBD = propiedades.getProperty("db.pass");
                boolean enableStatus = Boolean.parseBoolean(propiedades.getProperty("enable-status"));

                System.out.println("usuarioBD = " + usuarioBD);
                System.out.println("passBD = " + passBD);

                if (enableStatus){
                    System.out.println("El status está activado");
                }else{
                    System.out.println("El status NO está activado");
                }



            } catch (IOException e) {
                System.err.println("Error al cargar el fichero de properties: " + e);
            }
        }else{
            System.out.println("No veo ningún fichero con esta ruta: " + rutaFicheroProperties);
        }
    }
}
