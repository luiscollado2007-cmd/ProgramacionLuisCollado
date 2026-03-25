package practica;

import java.util.Random;
import java.util.Scanner;

public class PracticaHundirLaFlota {
    public static void main(String[] args) {
        //TODO:ESTO PARA PONER LOS ESPACIOS Y LAS COLUMNAS QUE QUIERA EL USUARIO
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca cuántas filas desea introducir");
        int fila = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ahora el número de columnas");
        int columna = teclado.nextInt();

        char[][] hundirLaFlota = crearTablero(fila,columna);
        //Aquí llamamos a las funciones que hemos utilizado para que el juego funcione correctamente y sin fallo alguno.
        colocarBarcos(hundirLaFlota);
        intentos(hundirLaFlota, fila, columna);
    }
    /*
    Esta función sirve para crear la matriz.
     */
    public static char[][] crearTablero(int filas, int columnas){
        char[][] matriz = new char[filas][columnas];
        //Rellenamos cada coordenada con guiones.
        for (int contFilas = 0; contFilas < filas; contFilas++) {
            for (int contColumnas = 0; contColumnas < columnas; contColumnas++) {
                matriz[contFilas][contColumnas] = '-';

            }
        }
        return matriz;
    }

    /*
    Esta función sirve para mostrar la matriz.
     */
    public static void mostrarTablero(char[][] flota){
        //Hacemos el encabezado de la columna, la cual va por números.
        System.out.print("  ");
        for (int columna = 0; columna < flota[0].length ; columna++) {
                //TODO: CAMBIAR ESTO PARA PONER MÁS GUIONES EN EL TABLERO
            System.out.printf("%2d ", columna);
        }
        System.out.println();
        //Luego, aquí ponemos las filas por letras.
        for (int fila = 0; fila < flota.length; fila++) {
            char letraFila = (char) ('A' + fila);
            System.out.print(letraFila + " ");
            for (int columna2 = 0; columna2 < flota[0].length; columna2++) {
                //TODO: CAMBIAR ESTO PARA PONER MÁS GUIONES EN EL TABLERO
                System.out.printf("%2c ", flota[fila][columna2]);
            }
            System.out.println();

        }

    }

    /*
    Esta función sirve para colocar todos los barcos horizontales dentro de la matriz.
     */
    public static void colocarBarcosHorizontal (char[][] flota,int longitud,char simbolo){
        //Utilizamos la estructura para que los barcos que se pongan, sean en coordenadas aleatorias.
        Random aleatorio = new Random();
        int fila;
        int columna;
        while (true){
                fila = aleatorio.nextInt(flota.length);
                columna = aleatorio.nextInt(flota[0].length - longitud + 1);
                boolean espacioLibre = true;

                //Hacemos una comprobación de sí en esa posición hay espacio libre.
            for (int sinSimbolo = 0; sinSimbolo < longitud; sinSimbolo++) {
                if (flota[fila][columna + sinSimbolo] != '-') {
                    espacioLibre = false;
                    break;
                }
            }

            //En caso de que si lo esté, rellenamos ese espacio libre con el símbolo del barco que pongamos.
            if (espacioLibre){
                for (int llenarHorizontal = 0; llenarHorizontal < longitud; llenarHorizontal++) {
                    flota[fila][columna + llenarHorizontal] = simbolo;
                }
                break;
            }
        }
    }
    /*
    Esta función va a servir para colocar aquellos barcos que solo se colocan en vertical.
     */
    public static void colocarBarcosVertical(char[][] flota , int longitud,char simbolo){
        Random aleatorio = new Random();
        while (true){
            int fila = aleatorio.nextInt(flota.length - longitud + 1);
            int columna = aleatorio.nextInt(flota[0].length);

            boolean espacioLibre = true;

            //Comprobamos otra vez si hay espacio libre, como en la función anterior.
            for (int sinSimbolo = 0; sinSimbolo < longitud; sinSimbolo++) {
                if (flota[fila + sinSimbolo][columna] != '-') {
                    espacioLibre = false;
                    break;
                }
            }

            //En caso de que haya espacio libre, hacemos lo mismo que la función anterior pero en vertical.
            if (espacioLibre){
                for (int llenarVertical = 0; llenarVertical < longitud; llenarVertical++) {
                    flota[fila + llenarVertical][columna] = simbolo;
                }
                break;
            }
        }

    }

    /*
    Esta función coge las dos funciones anteriores para colocar todos los barcos,
     tanto verticales como horizontales en una sola función para colocar cada barco en la forma pedida.
     */
    public static void colocarBarcos(char[][] flota){
        //Colocamos 2 lanchas.
        //Una en vertical y otro en horizontal para variar.
        colocarBarcosHorizontal(flota,1,'L');
        //Le cambio el simbolo para diferenciarlos.
        colocarBarcosVertical(flota,1,'H');

        //Colocamos 2 buques.
        colocarBarcosHorizontal(flota,3,'B');
        //Le cambio el simbolo para diferenciar de un buque a otro
        colocarBarcosHorizontal(flota,3,'Q');

        //Colocamos un acorazado.
        colocarBarcosHorizontal(flota,4,'Z');

        //Colocamos un portaavión.
        colocarBarcosVertical(flota,5,'P');

        //Colocamos tres minas.
        colocarBarcosHorizontal(flota,1,'M');
        colocarBarcosVertical(flota,1,'I');
        colocarBarcosHorizontal(flota,1,'N');

    }

    /*
    Esta función sirve para controlar el disparo del usuario, es decir,
     si introduce coordenadas que estén dentro del rango de la matriz
     */
    public static String disparo(String respuesta, char[][] flota, char[][] mostrarResultado){
        respuesta = respuesta.toUpperCase().trim();
        int numeroIntentos = 30;
        if (respuesta.length() < 2 || respuesta.length() > 4){
            return "La coordenada que has introducido no está bien";
        }

        char letraMatriz = respuesta.charAt(0);
        int fila = letraMatriz - 'A';

        //TODO: PARTE PARA COMPROBAR ERROR NUEVO
        String parteNumerica = respuesta.substring(1);


        // Comprobamos que todos los caracteres sean dígitos
        for (int cont = 0; cont < parteNumerica.length(); cont++) {
            char letraEnLugarDeNumero = parteNumerica.charAt(cont);

            if (letraEnLugarDeNumero < '0' || letraEnLugarDeNumero > '9') {
                return "La coordenada no es válida";
            }
        }

        // Si llegamos aquí, ya sabemos que es un número
        int columna = 0;

        // Convertimos a número "a mano"
        for (int cont = 0; cont < parteNumerica.length(); cont++) {
            columna = columna * 10 + (parteNumerica.charAt(cont) - '0');
        }
        //TODO:HASTA AQUÍ


        if (fila < 0 || fila >= flota.length || columna < 0 || columna >= flota[0].length){
            return "Esta coordenada es incorrecta";
        }

        char simboloDelBarco = flota[fila][columna];

        if (flota[fila][columna] == '-'){
            mostrarResultado[fila][columna] = 'A';
            return "Agua";
        }


        //TODO: AÑADÍ UNA CONDICIÓN DONDE SI PISA EN LA MINA DEVUELVA BOOM
        if (simboloDelBarco == 'M' || simboloDelBarco == 'I' || simboloDelBarco == 'N'){
            mostrarResultado[fila][columna] = 'X';
            return "BOOM";
        }

        mostrarResultado[fila][columna] = 'X';
        flota[fila][columna] = Character.toLowerCase(simboloDelBarco);

        // AHORA COMPROBAMOS SI QUEDA ALGUNA MAYÚSCULA DE ESE BARCO
        if (unBarcoHundido(flota, simboloDelBarco)) {
            return "Hundido";
        }
        return "Tocado";


    }

    /*
    Esta función sirve para saber que un barco está hundido
     */
    public static boolean unBarcoHundido(char[][] flota, char simbolo){
        for (int contFilas = 0; contFilas < flota.length; contFilas++) {
            for (int contColumnas = 0; contColumnas < flota[0].length; contColumnas++) {
                if (flota[contFilas][contColumnas] == simbolo){
                    return false;
                }
            }
        }
        return true;
    }

    /*
    Esta función sirve para comprobar que todos los barcos estén hundidos, la cual utilizaremos en la función intentos.
     */
    public static boolean barcosHundidos(char[][] flota){
        for (int fila = 0; fila < flota.length; fila++) {
            for (int columna = 0; columna < flota[0].length; columna++) {
                if (flota[fila][columna] == 'L' || flota[fila][columna] == 'B' || flota[fila][columna] == 'P' || flota[fila][columna] == 'Z' ){
                    return false;
                }
            }
        }
        return true;
    }

    /*
    Esta función lo que hace es que el usuario introduzca la coordenada
     donde controla los números de intentos que lleva el usuario.
     */
    //TODO: INT FILA Y INT COLUMNA AÑADIDA AHORA.
    public static void intentos(char[][] flota,int fila, int columna){
        Scanner teclado = new Scanner(System.in);
        char[][] mostrarTableroConCoordenadaDelUsuario= crearTablero(fila,columna);

        //TODO: PUSE LA VARIABLE ACIERTOSSEGUIDOS
        int numeroIntentos = 30;
        int aciertosSeguidos = 0;

        while (numeroIntentos > 0){

            mostrarTablero(mostrarTableroConCoordenadaDelUsuario);
            System.out.println("INTENTA DERRIBAR TODOS LOS BARCOS");
            System.out.println("Introduzca una coordenada.Por ejemplo:e4 o debug");
            String coordenadaUsuario = teclado.nextLine();

            //Modo debug
            if (coordenadaUsuario.equalsIgnoreCase("DEBUG")){
                System.out.println("Tablero oculto con todos los barcos");
                mostrarTablero(flota);
                continue;
            }


            String observacion = disparo(coordenadaUsuario,flota, mostrarTableroConCoordenadaDelUsuario);
            System.out.println(observacion);

            //TODO: HE PUESTO QUE EL USUARIO PUEDA VER CUANTOS INTENTOS TIENE, SI PISA UNA MINA, LE QUITA LA MITAD DE LOS INTENTOS
            //TODO: TMB QUE SI ACIERTA 3 SEGUIDOS, LE SUME 3 INTENTOS MÁS
            if (observacion.equals("BOOM")){
                numeroIntentos = numeroIntentos / 2;
                System.out.println("Has tocado una mina. Te quedan " + numeroIntentos + " intentos");
                aciertosSeguidos = 0;
            }else if(observacion.equals("Tocado") || observacion.equals("Hundido")){
                aciertosSeguidos++;
                numeroIntentos--;
                System.out.println("Te quedan " + numeroIntentos + " intentos");
                if (aciertosSeguidos == 3){
                    numeroIntentos += 3;
                    aciertosSeguidos = 0;
                    System.out.println("Has acertado tres seguidas, por tu buena racha, te regalo 3 intentos más");
                }
            }else{
                numeroIntentos--;
                aciertosSeguidos = 0;
                System.out.println("Te quedan " + numeroIntentos + " intentos");
            }



            if (barcosHundidos(flota)){
                System.out.println("¡Has ganado!");
                mostrarTablero(flota);
                return;
            }

        }
        //En el caso de que llegue a los 30 intentos.
        System.out.println("¡Has perdido!");
        System.out.println("Aquí están las coordenadas que te faltaron por acertar");
        mostrarTablero(flota);

    }
}


