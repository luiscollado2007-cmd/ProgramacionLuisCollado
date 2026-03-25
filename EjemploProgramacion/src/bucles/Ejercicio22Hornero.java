package bucles;

import java.util.Scanner;

public class Ejercicio22Hornero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero para ver su piramide");
        int numFilas = teclado.nextInt();
        int numAstericos = 1;
        int espacioMax = numFilas -1;

        for (int fila = 0; fila < numFilas; fila++) {
            for (int conEspacios = 1; conEspacios <= espacioMax ; conEspacios++) {
                System.out.print(" ");
            }
            for (int contAstericos = 1; contAstericos <= numAstericos; contAstericos++) {
                System.out.print("*");
            }

            espacioMax--;
            numAstericos+= 2;
            System.out.println(" ");
        }


    }
}
