package repasora3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1Examen {
    public static void main(String[] args) {

        System.out.println("**** MINI SUDOKU ALEATORIO ***");
        System.out.println("Tu cuadrado es: ");
        int[][] matriz = new int[3][3];
        int[] numNoRepetidos = new int[9];
        int contador = 0;
        Random random = new Random();

        while (contador < 9) {
            int num = random.nextInt(9) + 1;
            boolean repetido = false;

            for (int contNumRepetidos = 0; contNumRepetidos < contador; contNumRepetidos++) {
                if (numNoRepetidos[contNumRepetidos] == num) {
                    repetido = true;
                }
            }

            if (!repetido) {
                numNoRepetidos[contador] = num;
                contador++;
            }
        }
            
            int posicionNum = 0;
            for (int cont = 0; cont < matriz.length; cont++) {
                for (int cont2 = 0; cont2 < matriz[0].length; cont2++) {
                    matriz[cont][cont2] = numNoRepetidos[posicionNum];
                    posicionNum++;
                }
            }

            for (int cont = 0; cont < matriz.length; cont++) {
                for (int cont2 = 0; cont2 < matriz[0].length; cont2++) {
                    System.out.print(matriz[cont][cont2]);
                }
                System.out.println("\n");
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un número a buscar (1-9):");
            int buscado = sc.nextInt();

            boolean encontrado = false;
            int fila = -1;
            int columna = -1;

            // Buscar número
            for (int contFilas = 0; contFilas < matriz.length; contFilas++) {
                for (int contColumna = 0; contColumna < matriz[0].length; contColumna++) {
                    if (matriz[contFilas][contColumna] == buscado) {
                        encontrado = true;
                        fila = contFilas + 1;
                        columna = contColumna + 1;
                    }
                }
            }

            if (encontrado) {
                System.out.println("El número " + buscado + " SÍ está en el cuadrado (fila "
                        + fila + ", columna " + columna + ").");
            } else {
                System.out.println("El número " + buscado + " NO está en el cuadrado.");
            }

            sc.close();
        }
}

