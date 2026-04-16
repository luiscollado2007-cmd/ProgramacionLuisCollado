package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EjemploEscrituraFichero {

    public static void main(String[] args) {


        Path rutaFichero = Paths.get("Salida1.txt");
        try{
            Files.writeString(rutaFichero,"\ny yo también.......", StandardOpenOption.APPEND);
            System.out.println("Contenido escrito en: " + rutaFichero);
        }catch (IOException e){
            System.out.println("Error al escribir en el fichero... " + e);
        }

    }
}
