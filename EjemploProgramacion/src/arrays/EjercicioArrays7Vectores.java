package arrays;

import java.util.Scanner;

public class EjercicioArrays7Vectores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame dos números y te hago un array desde el primer número hasta el segundo número");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        teclado.nextLine();

        double[] numUsuario = new double[numero2];
        int capacidad = numUsuario.length;
        System.out.println("La capacidad que has introducido es: " + capacidad);

        for (int cont = 0; cont < numUsuario.length ; cont++) {
            numUsuario[cont] = numero1;
            System.out.println("El número " + (cont+1) + " es: " + numero1);
        }
    }
}
