package repasoset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame el primer número:");
        int num1 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Dame el segundo número:");
        int num2 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Dame el tercer número:");
        int num3 = teclado.nextInt();
        teclado.nextLine();


        System.out.println("Dame el cuarto número:");
        int num4 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Dame el quinto número:");
        int num5 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Dame el sexto número:");
        int num6 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dame el séptimo número:");
        int num7 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dame el octavo número:");
        int num8 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dame el noveno número:");
        int num9 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dame el décimo número:");
        int num10 = teclado.nextInt();
        teclado.nextLine();
        Set<Integer> numeros = new HashSet<>();

        numeros.add(num1);
        numeros.add(num2);
        numeros.add(num3);
        numeros.add(num4);
        numeros.add(num5);
        numeros.add(num6);
        numeros.add(num7);
        numeros.add(num8);
        numeros.add(num9);
        numeros.add(num10);

        System.out.println("Lista de los 10 números: " + numeros);
    }
}
