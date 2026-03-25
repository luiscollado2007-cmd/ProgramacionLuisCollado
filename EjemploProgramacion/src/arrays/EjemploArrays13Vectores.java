package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArrays13Vectores {
    public static void main(String[] args) {

        System.out.println("Dime cuántos números ponemos,por favor");
        Scanner teclado = new Scanner(System.in);
        int totalNumeros = teclado.nextInt();
        System.out.println("Dime con qué valor empezamos");
        int valorInicial = teclado.nextInt();
        System.out.println("Dime con qué incremento hacemos la secuencia");
        int incremento = teclado.nextInt();

        int[] secuencia = new int[totalNumeros];
        int siguienteNumero = 0;
        for (int cont = 0; cont < secuencia.length ; cont++) {
            siguienteNumero =  valorInicial + (incremento * cont);
            secuencia[cont] = siguienteNumero ;
        }
        System.out.println("La secuencia es: ");
        System.out.println(Arrays.toString(secuencia));
    }
}
