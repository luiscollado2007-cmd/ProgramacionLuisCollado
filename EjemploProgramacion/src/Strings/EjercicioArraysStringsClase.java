package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArraysStringsClase {
    public static void main(String[] args) {
        String frase = null;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduce una frase y te separo cada palabra del texto que hayas introducido");
            frase = teclado.nextLine();




            if (!frase.equals("")) {

                char[] caracteresFrase = frase.toCharArray();
                int numEspacios = 0;

                for (int cont = 0; cont < caracteresFrase.length; cont++) {
                    if (caracteresFrase[cont] == ' ') {
                        numEspacios++;
                    }
                }
                String[] palabras = new String[numEspacios + 1];
                int indiceEspacio = -1;
                int contPalabras = 0;
                do {
                    indiceEspacio = frase.indexOf(" ");
                    String palabra = null;
                    if (indiceEspacio != -1) {
                        palabra = frase.substring(0, indiceEspacio);
                        frase = frase.substring(indiceEspacio + 1);
                    } else {
                        palabra = frase;
                    }

                    palabras[contPalabras++] = palabra;
                } while (indiceEspacio != -1);

                for (int contPalabra = 0; contPalabra < palabras.length; contPalabra++) {
                    System.out.println(contPalabra + " -> " + palabras[contPalabra]);
                }
            }else{
                System.out.println("No hay frase....");
            }
        }while (!frase.equals(""));

        System.out.println("FIN!");
    }
}
