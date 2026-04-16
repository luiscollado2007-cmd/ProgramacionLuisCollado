package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class EjemploEscrituraMultiplesLineas {

    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("Sheila","Noelia","Otman","Bea","Bowen","Marcos","Denzel","Andres");

        Path ficheroNombres = Paths.get("Salida3.txt");
        try {
            if (Files.exists(ficheroNombres)){
                Files.write(ficheroNombres,nombres, StandardOpenOption.APPEND);
                System.out.println("Nombres escritos correctamente en: " + ficheroNombres);
            }else{
                Files.createFile(ficheroNombres);
            }

        }catch (IOException e){
            System.out.println("Error general al interactuar con el fichero: " + e);
        }
    }
}
