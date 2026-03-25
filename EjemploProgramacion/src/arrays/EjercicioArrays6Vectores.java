package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays6Vectores {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un valor entero para decidir el tamaño que vas a usar y otro" +
                " para mostrarte ese número en todas las posiciones");
        int valorUsuario1 = teclado.nextInt();
        double valorUsuario2 = teclado.nextInt();
        teclado.nextLine();

        double[] valorUsuario = new double[valorUsuario1];
        int capacidad = valorUsuario.length;
        System.out.println("La capacidad que has introducido es: " + capacidad);
        for (int cont = 0; cont < valorUsuario.length ; cont++) {
            valorUsuario[cont] = valorUsuario2;
            System.out.println("El número " + (cont+1) + " es: "
                    + valorUsuario2);

        }



    }
}
