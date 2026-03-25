package FUNCIONES;

import java.util.Arrays;

public class EjercicioParseoLineaConFunciones {

    public static final int NUM_DATOS_ALUMNO = 4;

    public static double notaMasAlta = 0;

    public static String[][] matrizAlumnosPorCiclo = new String[10][2];

    public static int siguientePosicionLibre = 0;

    public static void main(String[] args) {
        String[] arrayAlumnos = ficheroAlumnos();

       mostrarNombres(arrayAlumnos);

        System.out.println("La media de edades es: " + obtenerMediaEdades(arrayAlumnos));

        notaMasAlta = obtenerNotaMaxima(arrayAlumnos);
        System.out.println("La nota máxima es: " + notaMasAlta);


        rellenarMatrizAlumnosPorCiclo(arrayAlumnos);

        mostrarMatrizAlumnosPorCiclo();



    }

    private static void mostrarMatrizAlumnosPorCiclo() {
        for (int contFila = 0; contFila < matrizAlumnosPorCiclo.length; contFila++) {
            for (int contColumna = 0; contColumna < matrizAlumnosPorCiclo[0].length; contColumna++) {

            }
        }
    }

    private static void rellenarMatrizAlumnosPorCiclo(String[] arrayAlumnos) {

        //TODO: COGER CADA LÍNEA DE LOS ALUMNOS
        for (int cont = 0; cont < arrayAlumnos.length; cont++) {
            String[] valores = parsearLinea(arrayAlumnos[cont]);
            String cicloFomrativo = valores[2];

            int posicionCiclo = buscarCicloEnMatriz(cicloFomrativo);
            if (posicionCiclo == -1){
                //no lo he encontrado, tengo que rellenarlo
                matrizAlumnosPorCiclo[siguientePosicionLibre][0] = cicloFomrativo;
            }
        }
        //TODO: PARSEARLA(CON PARSEARLÍNEA)
        //TODO: coger el ciclo al que pertenece cada alumno
        //TODO: METERLO EN LA MATRIZ, O SI YA EXISTE, INCREMENTAR EL Nº DE ALUMNO.
    }
    /*
    Busca un ciclo formativo en la matriz grande.
    Si existe, me devuelve la fila donde está
    si no existe, me devuelve -1.
     */
    public static int buscarCicloEnMatriz(String ciclo){
        int filaCiclo = -1;
        for (int contFila = 0; contFila < matrizAlumnosPorCiclo.length; contFila++) {

            String cicloEnMatriz = matrizAlumnosPorCiclo[contFila][0];
            if (cicloEnMatriz != null && cicloEnMatriz.equalsIgnoreCase(ciclo)){
                filaCiclo = contFila;
                break;
            }
        }
        return filaCiclo;
    }

    public static String[] ficheroAlumnos(){
        String[] alumnos = {
                "PACO|49|DAW|8.4",
                "LUCIA|22|DAM|7.9",
                "MARIO|31|ASIR|6.5",
                "ANA|18|DAW|9.1",
                "RAUL|27|DAM|5.8",
                "SOFIA|24|ASIR|7.2",
                "CARLOS|35|DAW|6.9",
                "ELENA|20|DAM|8.7",
                "JORGE|29|ASIR|7.0",
                "BEATRIZ|23|DAW|9.4"
        };
        return alumnos;
    }

    public static String[] parsearLinea(String lineas){
        String[] valoresLinea = new String[4];

        int posAnteriorBarra = 0;
        int posSiguienteBarra = 0;
        int contPalabras = 0;
        posSiguienteBarra = lineas.indexOf("|", 0);
        while (posSiguienteBarra != -1){
            String palabra = lineas.substring(posAnteriorBarra, posSiguienteBarra);
            valoresLinea[contPalabras++] = palabra;
            posAnteriorBarra = posSiguienteBarra + 1;
            posSiguienteBarra = lineas.indexOf("|", posSiguienteBarra + 1);
        }
        valoresLinea[contPalabras] = lineas.substring(posAnteriorBarra);

        return valoresLinea;
    }

    public static int obtenerEdadDeValores(String[] valores){
        String edad = valores[1];
        return Integer.parseInt(edad);
    }

    public static double obtenerNotaDeValores(String[] valores){
        String nota = valores[3];
        return Double.parseDouble(nota);
    }

    public static void mostrarNombres(String[] alumnos){
        for (int cont = 0; cont < alumnos.length; cont++) {
            String lineaAlumno = alumnos[cont];
            String[] valoresAlumno = parsearLinea(lineaAlumno);
            String nombreAlumno = valoresAlumno[0];
        }
    }

    public static String convertirFormatoFrase(String palabra){

        String primeraLetra = palabra.substring(0,1);
        String resto = palabra.substring(1);
        return primeraLetra.toUpperCase() + resto.toLowerCase();

    }

    public static float obtenerMediaEdades(String[] alumnos){
        int sumaTotal = 0;
        for (int cont = 0; cont < alumnos.length; cont++) {
            String[] valoresAlumno = parsearLinea(alumnos[cont]);
            sumaTotal += obtenerEdadDeValores(valoresAlumno);
        }
        return (float) sumaTotal / alumnos.length;
    }

    public static double obtenerNotaMaxima(String[] alumnos){
        double notaMaxima = 0;
        for (int cont = 0; cont < alumnos.length; cont++) {
            String[] valores = parsearLinea(alumnos[cont]);
            double nota = obtenerNotaDeValores(valores);
            notaMaxima = Math.max(notaMaxima,nota);
        }
        return notaMaxima;
    }

    public static void mostrarAlumnosPorCiclo(String[] alumnos){

    }
}
