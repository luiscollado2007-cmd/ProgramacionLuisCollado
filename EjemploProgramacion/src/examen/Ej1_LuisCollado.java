package examen;

import java.util.Scanner;

public class Ej1_LuisCollado {
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];
        Scanner teclado = new Scanner (System.in);
        System.out.println("MINI SUDOKU ALEATORIO");


        for (int contFilas = 0; contFilas < numeros.length; contFilas++) {
            for (int contColumnas = 0; contColumnas < numeros[0].length; contColumnas++) {
                Math.random();
                int valor_Aleatorio = (int) Math.random() * (9 - 1 + 1) + 1;
            }
        }
        for (int contFilas = 0; contFilas < numeros.length; contFilas++) {
            for (int contColumnas = 0; contColumnas < numeros[0].length; contColumnas++) {
                System.out.print(numeros[contFilas][contColumnas] + " ");
            }
            System.out.println();

        }

        for (int contFilas = 0; contFilas < numeros.length; contFilas++) {
            for (int contColumnas = 0; contColumnas < numeros[0].length; contColumnas++) {
                System.out.println("Dime un número del 1 al 9, por favor");
                int numUsuario = teclado.nextInt();
                if (numUsuario == numeros[contFilas][contColumnas]){
                    System.out.println("El " + numUsuario + " está en el cuadrado" + " (fila " + contFilas + " , " + " columna " + contColumnas + ")");
                }else{
                    System.out.println("El número que has introducido no está en el sudoku");
                }
            }
        }


    }
}
