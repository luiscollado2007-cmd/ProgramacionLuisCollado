package arrays.MATRICES;

import java.util.Random;
import java.util.Scanner;

public class EjercicioMatriz {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de filas y el número de columnas que deseas usar, por favor");
        int numFilas = teclado.nextInt();
        int numColumnas = teclado.nextInt();
        teclado.nextLine();

        double[][] matriz = new double[numFilas][numColumnas];
        int longitudMatriz1aDim = matriz.length;
        int longitudMatriz2aDim = matriz[0].length;
        System.out.println("longitudMatriz1aDim = " + longitudMatriz1aDim);
        System.out.println("longitudMatriz2aDim = " + longitudMatriz2aDim);

        System.out.println("Has introducido " + numFilas + " filas y " + numColumnas + " columnas" );


        Random genAleatorio = new Random();

        for (int fila = 0; fila < longitudMatriz1aDim ; fila++) {
            for (int columnas = 0; columnas < longitudMatriz2aDim ; columnas++) {
                //Otra forma de generar números aleatorios
                //matriz[fila][columnas] = Math.random();
                matriz[fila][columnas] = genAleatorio.nextDouble(0,10.01);

            }
        }
        //Variable que trunca los decimales
        //Math.floor();
        for (int fila = 0; fila < longitudMatriz1aDim ; fila++) {
            for (int columnas = 0; columnas < longitudMatriz2aDim ; columnas++) {
                System.out.println(fila + "," + columnas + " = " + matriz[fila][columnas] );
                //Acabar el BONUS.

            }
        }
    }
}
