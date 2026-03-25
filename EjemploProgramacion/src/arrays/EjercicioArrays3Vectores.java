package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays3Vectores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame 10 número enteros, por favor");
        double[] numUsuario = new double[10];

        for (int cont = 0; cont < numUsuario.length ; cont++) {

            System.out.println("Dime el número " + (cont+1));
            numUsuario[cont] = teclado.nextInt();

        }

        double maximo = numUsuario[0];
        double minimo = numUsuario[0];

        for (int cont = 0; cont < numUsuario.length ; cont++) {
            if (numUsuario[cont] > maximo){
                maximo = numUsuario[cont];
            }
            if (numUsuario[cont] < minimo){
                minimo = numUsuario[cont];
            }

        }
        System.out.println("numUsuario = " + Arrays.toString(numUsuario));
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
    }
}
