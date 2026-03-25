package arrays;

import java.util.Scanner;

public class EjercicioMapa {
    public static void main(String[] args) {

        char[][] tablero = new char[5][5];
        for (int contFila = 0; contFila < tablero.length; contFila++) {
            for (int contColumna = 0; contColumna < tablero[0].length; contColumna++) {
                tablero[contFila][contColumna] = '_';
            }
        }

        for (int contFila = 0; contFila < tablero.length; contFila++) {
            for (int contColumna = 0; contColumna < tablero[0].length; contColumna++) {
                System.out.print(tablero[contFila][contColumna]);
            }
            System.out.println();
        }

        //1ºPedir al usuario una dirección de movimiento
        //2ºCoger las coordenadas actuales (las tendré en variables)
        //3ºCalcular las nuevas coordenadas según la dirección
        //4ºPongo el símbolo en la nueva coordenada
        //5º Limpio la coordenada antigua
        //Repetir
        System.out.println("Bienvenido al juego.");
        Scanner teclado = new Scanner(System.in);
        String respuestaUsuario = "";
        int posX = 2;
        int posY = 2;
        int posXNueva = posX; //las voy a utilizar como "Preview"
        int posYNueva = posY; //las voy a utilizar como "Preview"
        final char simbolo = '@';
        final char simboloVacio = '_';

        int totalFilas = tablero.length;
        int totalColumnas = tablero[0].length;

        do {
            for (int contFila = 0; contFila < tablero.length; contFila++) {
                for (int contColumna = 0; contColumna < tablero[0].length; contColumna++) {
                    System.out.print(tablero[contFila][contColumna]);
                }
                System.out.println();
            }
            System.out.println("¿En que dirección te mueves?");
            System.out.println("W: arriba");
            System.out.println("S: abajo");
            System.out.println("D: derecha");
            System.out.println("A: izquierda");
            System.out.println("0:  (salir)");

            respuestaUsuario = teclado.nextLine();
            respuestaUsuario = respuestaUsuario.toUpperCase();

            switch (respuestaUsuario){
                case "W":
                    posXNueva--;
                    break;
                case "S":
                    posXNueva++;
                    break;
                case "D":
                    posYNueva++;
                    break;
                case "A":
                    posYNueva--;
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opción no válida");
            }


            if (posXNueva < 0 || posXNueva >= totalFilas
            || posYNueva < 0 || posYNueva >= totalColumnas){
                System.out.println("No puedes moverte esa posición. Te sales");
                posXNueva = posX;
                posYNueva = posY;
            }else{
                //limìpiar la posición
                tablero[posX][posY] = simboloVacio;
                tablero[posXNueva][posYNueva] = simbolo;

                posX = posXNueva;
                posY = posYNueva;
            }
            System.out.println();

        }while (!respuestaUsuario.equals("0"));
    }
}
