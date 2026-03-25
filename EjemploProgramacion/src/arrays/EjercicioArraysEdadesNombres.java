package arrays;

import java.util.Scanner;

public class EjercicioArraysEdadesNombres {
    public static void main(String[] args) {
        System.out.println("Dime cuántos amigos tienes");
        Scanner teclado = new Scanner(System.in);
        int totalAmigos = teclado.nextInt();
        int[] edadesAmigos = new int[totalAmigos];
        String[] nombreAmigos = new String[totalAmigos];

        for ( int contAmigo = 0; contAmigo < totalAmigos; contAmigo++){
            System.out.println("Dime edad del amigo número " + (contAmigo + 1));
            int edadAmigo = teclado.nextInt();
            edadesAmigos[contAmigo] = edadAmigo;
            System.out.println("Dime el nombre del amigo número " + (contAmigo + 1));
            teclado.nextLine();
            nombreAmigos[contAmigo] = teclado.nextLine();
            System.out.println("Edad del amigo " + (contAmigo+1) + " es: " + edadesAmigos[contAmigo] + " años.");
            System.out.println("Nombre del amigo " + (contAmigo+1) + " es: " + nombreAmigos[contAmigo]);
        }
    }
}
