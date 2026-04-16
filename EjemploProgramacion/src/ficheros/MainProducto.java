package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MainProducto {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();
        Path ficheroCsv = Paths.get("C:\\Users\\Antonio\\Downloads\\ficheros.csv");


        try{
            if (Files.isRegularFile(ficheroCsv)){
                System.out.println("El fichero funciona correctamente");
                productos.add((Producto) ficheroCsv);
                for (Producto p: productos){
                    System.out.println(p);
                }
            }
            if (!Files.exists(ficheroCsv)){
                System.out.println("El fichero detectado no existe...");
            }


        }catch (Exception e) {
            System.out.println("Error al leer el fichero " + e.getMessage());
        }

    }
}
