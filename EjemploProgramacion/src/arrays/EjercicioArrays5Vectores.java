package arrays;

import java.util.Scanner;

public class EjercicioArrays5Vectores {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame 20 número enteros, por favor");
        double[] numUsuario = new double[20];
        for (int cont = 0; cont < numUsuario.length ; cont++) {
            numUsuario[cont] = teclado.nextInt();

        }
        int suma = 0;
        for (int cont = 0; cont < numUsuario.length ; cont++) {
            suma += (int) numUsuario[cont];
        }

        System.out.println("La suma de todos los números es: " + suma);
        double media = (double) suma / numUsuario.length;
        System.out.println("La media de la suma: " + media);


    }
}
