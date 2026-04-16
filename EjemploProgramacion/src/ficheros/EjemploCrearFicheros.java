package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EjemploCrearFicheros {

    public static void main(String[] args) {


        Path rutaFicheroNuevo = Paths.get("Salida1.txt");
        try {
            if (Files.exists(rutaFicheroNuevo)) {
                System.out.println("El fichero ya existe");
            }else{
                Files.createFile(rutaFicheroNuevo);
            }
        }catch (IOException e){
            System.out.println("Excepción al interactuar con el sistema de ficheros. Más info: " + e);
        }

    }
}
