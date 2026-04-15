package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EjemploRutas {

    public static void main(String[] args) {

        Path rutaFichero = Paths.get("C:\\Users\\Antonio\\Downloads\\EjemploFicherosJava\\Datos_ejemplo.txt");

        System.out.println("La ruta del fichero es: " + rutaFichero);
        System.out.println("El nombre del fichero es: " + rutaFichero.getFileName());
        System.out.println("La ruta padre es: " + rutaFichero.getParent());

        try {
            List<String> contenidoFichero = Files.readAllLines(rutaFichero);

            for (String linea : contenidoFichero){
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e);
        }
    }
}
