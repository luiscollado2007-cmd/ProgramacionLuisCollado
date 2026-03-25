package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays4Vectores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame 20 número enteros, por favor");
        double[] numUsuario = new double[20];
        for (int cont = 0; cont < numUsuario.length ; cont++) {
            numUsuario[cont] = teclado.nextInt();

        }
        int sumaNegativos = 0;
        int sumaPositivos = 0;
        for (int cont = 0; cont < numUsuario.length ; cont++) {
            if (numUsuario[cont] < 0) {
                sumaNegativos += (int) numUsuario[cont];
            } else {
                sumaPositivos += (int) numUsuario[cont];
            }
        }

        System.out.println("numUsuario = " + Arrays.toString(numUsuario));
        System.out.println("El valor de los números positivos es: " + sumaPositivos);
        System.out.println("El valor de los números negativos es: " + sumaNegativos);
    }
}
