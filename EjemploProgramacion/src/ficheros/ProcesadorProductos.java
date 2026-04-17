package ficheros;

import com.sun.security.jgss.GSSUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcesadorProductos {

    public static void main(String[] args) {
        System.out.println("*** Bienvenido al sistema de productos *** ");
        System.out.println("Dime ruta de fichero a leer (puede ser absoluta o relativa)");

        Scanner teclado = new Scanner(System.in);
        String nombreRuta = teclado.nextLine();
        //leer el fichero. Preguntar al usuario cuál es la ruta del fichero
        try {
            Path rutaFichero = Paths.get(nombreRuta);
            //comprobar si el fichero existe o no, si es un fichero como tal
            if(!Files.exists(rutaFichero)){
                System.out.println("No se encuentra el fichero");
            }else if(!Files.isRegularFile(rutaFichero)){
                System.out.println("Eso no es un fichero que se pueda leer");
            }else{

                //leer las lineas. De cada línea, procesarla. Descomponer las palabras
                //de la línea y crear objeto de producto. Meter a lista de productos
                List<String> lineas = Files.readAllLines(rutaFichero);

                List<Producto> productos = extraerProductos(lineas);
                //Mensaje: importación exitosa
                System.out.println("Importación exitosa. Productos importados: " + productos.size());
                mostrarListaProductos(productos);

                //TODO: Exportar la lista de productos a informes/infoProductos.txt
                //con el formato que dijimos
                if(productos.size() > 0){
                    exportarProductos(productos);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer ficheros: " + e);
        }




    }

    /**
     * Exportar los productos en un formato determinado, al ficher ubicado en ruta:
     * informes/infoProductos.txt
     * @param productos
     */
    private static void exportarProductos(List<Producto> productos) {

        //TODO: crear o comprobar que la carpeta existe
        try{
            Path rutaCarpetaInformes = Paths.get("informes");
            if(!Files.exists(rutaCarpetaInformes)){
                Files.createDirectory(rutaCarpetaInformes);
            }

            List<String> lineas = new ArrayList<>();
            for(Producto prod: productos){
                lineas.add(convertirProductoALinea(prod));
            }

            Path rutaFicheroInformes = Paths.get("informes/infoProductos.txt");
            Files.write(rutaFicheroInformes, lineas);
            System.out.println(" --> Exportacion de productos completada");
        }catch (IOException e){
            System.out.println("Error al operar con el fichero de informes " + e);
        }

    }
    private static String convertirProductoALinea(Producto unProducto){

        String plantilla = "Producto con ID %d, se llama %s, cuesta %f y tenemos %d en stock";
        return String.format(plantilla,
                unProducto.getId(),
                unProducto.getNombre(),
                unProducto.getPrecio(),
                unProducto.getStock());
    }

    private static void mostrarListaProductos(List<Producto> productos) {

        for (Producto p: productos){
            System.out.println(p);
        }
    }

    private static List<Producto> extraerProductos(List<String> lineas) {

        List<Producto> productos = new ArrayList<>();;
        if(!lineas.isEmpty()){
            int cont = 0;
            for (String linea: lineas){
                //linea= "101,Camisa,25.99,50"
                if(cont > 0) {
                    try {
                        Producto prod = convertirLineaAProducto(linea);
                        if(prod!=null)
                            productos.add(prod);
                    }catch (Exception e){
                        System.err.println("ERROR. Línea " + cont + " no procesada. No cumple el formato. Linea original: " + linea);
                    }
                }
                cont++;
            }
        }

        return productos;
    }

    /**
     * Convertir una linea del tipo "101,Camisa,25.99,50" a objeto de clase Producto
     * @param linea Linea de fichero de producto. Ej "101,Camisa,25.99,50"
     * @return objeto de producto con la información
     */
    private static Producto convertirLineaAProducto(String linea) {

        String[] elementos = linea.split(",");
        if(elementos != null && elementos.length == 4){
            int id = Integer.parseInt(elementos[0]);
            String nombreProducto = elementos[1];
            double precio = Double.parseDouble(elementos[2]);
            int stock = Integer.parseInt(elementos[3]);

            return new Producto(id, nombreProducto, precio, stock);

        }else{
            //TODO: problema, si no cumple el formato, no se dice nada por pantalla.
            //Mejor elevar una excepcion
            return null;
        }


    }
}