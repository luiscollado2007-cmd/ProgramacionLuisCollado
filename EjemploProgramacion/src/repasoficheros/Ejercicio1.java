package repasoficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Esta clase, lo que hará, será leer un .txt línea a línea.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Path rutaFicheros = Paths.get("alumno.txt");
        try {
            if (Files.exists(rutaFicheros)) {
                System.out.println("El fichero ya existe");

            } else {
                Files.createFile(rutaFicheros);
            }
            List<String> contenidoFichero = Files.readAllLines(rutaFicheros);
            for (String linea : contenidoFichero){
                System.out.println(linea);
            }
        }catch(IOException e){
            System.out.println("Excepción al interactural con el fichero. Información: " + e);
        }
    }
}
