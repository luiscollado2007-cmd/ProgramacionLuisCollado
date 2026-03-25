package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays1Vectores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame 10 número enteros, por favor");
        double[] numUsuario = new double[10];
        for (int cont = 0; cont < numUsuario.length ; cont++) {
            numUsuario[cont] = teclado.nextInt();
        }

        for (int cont = 0; cont < numUsuario.length; cont++) {

        }


        System.out.println("numUsuario = " + Arrays.toString(numUsuario));
    }
}
