package accesobd.ejercicioventas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GestorFicheros {

    public static final String CABECERA_FICH_VENTAS_PROD = "NOMBRE_PRODUCTO, UNIDADES_VENDIDAS";

    public static void volcarVentasPorProducto(Map<String, Integer> mapa){

        try {
            comprobarCarpetaExportaciones();
            Path rutaFichero = Paths.get(ConstantesGenerales.CARPETA_EXPORTACIONES, ConstantesGenerales.NOMBRE_FICHERO_VENTAS_PRODUCTO);

            //Escribo la cabecera del fichero en la primera linea
            Files.writeString(rutaFichero, CABECERA_FICH_VENTAS_PROD + "\r\n");
            //Escribo el resto de líneas
            List<String> lineasMapa = convertirMapaEnLineas(mapa);
            Files.write(rutaFichero, lineasMapa, StandardOpenOption.APPEND);

            System.out.println("Relación de ventas por producto exportado correctamente en: " + rutaFichero);

        } catch (IOException e) {
            System.err.println("No hemos podido exportar el fichero. Más información: " + e);
        }
    }

    private static List<String> convertirMapaEnLineas(Map<String, Integer> mapa){
        List<String> lineas = new ArrayList<>();

        for(Map.Entry<String, Integer> entrada: mapa.entrySet()){
            String lineaFich = entrada.getKey() + "," + entrada.getValue();
            lineas.add(lineaFich);
        }

        return lineas;
    }

    private static void comprobarCarpetaExportaciones() throws IOException {
        Path rutaCarpetaExport = Paths.get(ConstantesGenerales.CARPETA_EXPORTACIONES);
        if(!Files.exists(rutaCarpetaExport)){
            System.out.println("(Creando directorio de exportaciones en: "  + rutaCarpetaExport + " )");
            Files.createDirectory(rutaCarpetaExport);
        }

    }

}