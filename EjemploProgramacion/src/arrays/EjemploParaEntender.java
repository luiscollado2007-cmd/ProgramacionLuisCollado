package arrays;

import java.util.Random;
import java.util.Scanner;

public class EjemploParaEntender {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Dime cuántas notas vas a poner y te hago la media de ellas");
            int numNotas = teclado.nextInt();
            int[] notas = new int[numNotas];

            int capacidad = notas.length;
            System.out.println("Puedes poner: " + capacidad + " notas.");
            Random generadorAleatorios = new Random();

            // 1º: Recorrer el array mostrando todos los valores. Uno en cada línea
            System.out.println("Todas las notas:");
            for (int cont = 0; cont < notas.length; cont++){
                int numAleatorio = generadorAleatorios.nextInt(0,11);
                notas[cont] = numAleatorio;
                System.out.println("La nota " + (cont+1) + " es: " + numAleatorio);
            }

            // 2º: Recorrer el array (en otro bucle distinto) y hacer la media de las notas
            int suma = 0;
            for (int nota : notas) {
                suma += nota;
            }
            double media = (double) suma / notas.length;
            System.out.println("\nMedia de las notas: " + media);

            // 3º: Recorrer el array hasta encontrar una nota igual a 10
            System.out.println("\nBuscando una nota igual a 10...");
            for (int nota : notas) {
                if (nota == 10) {
                    System.out.println("¡Nota perfecta encontrada: " + nota + "!");
                    break;
                }
                System.out.println("Nota: " + nota);
            }
        }
    }

