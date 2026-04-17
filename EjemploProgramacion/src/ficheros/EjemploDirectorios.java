package ficheros;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EjemploDirectorios {

    public static void main(String[] args) {

        Path carpetaInformes = Paths.get("informes");
        System.out.println(carpetaInformes);
        if(Files.exists(carpetaInformes)){
            System.out.println("Existe la carpeta: " + carpetaInformes);
        }else {
            System.out.println("No existe la carpeta: " + carpetaInformes);

            try {
                Files.createDirectory(carpetaInformes);
                System.out.println("\n Carpeta creada");

                Path rutaFichero = Paths.get("informes", "infoProductos.txt");
                Files.createFile(rutaFichero);

            }catch (FileAlreadyExistsException e){
                System.out.println("Estás intentando crear un elemento ya existente: " + e);
            } catch (IOException e) {
                System.out.println("Error general al operar:" + e);
            }



        }




    }
}