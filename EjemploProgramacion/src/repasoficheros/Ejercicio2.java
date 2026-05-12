package repasoficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Esta clase, lo que hará es contar todas las líneas que hay en ese fichero.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Path ruta = Paths.get("log.txt");
        try {
            if (Files.exists(ruta)){
                System.out.println("El fichero existe");
            }else{
                Files.createFile(ruta);
            }
            int numLineas = 0;
            List<String> contenido = Files.readAllLines(ruta);
            for (String linea : contenido){
                numLineas++;
            }
            System.out.println("EL fichero tiene " + numLineas + " líneas");
        }catch (IOException e){
            System.out.println("Error al interactuar con el fichero, Más información: " + e);
        }
    }
}
