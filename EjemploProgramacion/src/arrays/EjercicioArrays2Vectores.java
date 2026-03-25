package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays2Vectores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame 10 número enteros, por favor");
        double[] numUsuario = new double[10];
        for (int cont = 0; cont < numUsuario.length ; cont++) {
            numUsuario[cont] = teclado.nextInt();

        }
        int suma = 0;
        for (int cont = 0; cont < numUsuario.length ; cont++) {
            suma += (int) numUsuario[cont];
        }

        System.out.println("numUsuario = " + Arrays.toString(numUsuario));
        System.out.println("La suma de todos los valores es: " + suma);

    }
}
