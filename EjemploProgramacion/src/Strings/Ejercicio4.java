package Strings;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un frase y te digo el nº de vocales");
        String frase = teclado.nextLine();
        int contAs = 0, contEs = 0, contIs = 0, contOs = 0, contUs = 0;

        String fraseMayus = frase.toUpperCase();
        //Reemplazo la tildes por las letras "normales"
        fraseMayus = fraseMayus.replace('Á','A');
        fraseMayus = fraseMayus.replace('É','E');
        fraseMayus = fraseMayus.replace('Í','I');
        fraseMayus = fraseMayus.replace('Ó','O');
        fraseMayus = fraseMayus.replace('Ú','U');
        System.out.println("fraseMayus = " + fraseMayus);
        for (int cont = 0; cont < fraseMayus.length() ; cont++) {
            char letra = fraseMayus.charAt(cont);
            switch (letra){
                case 'A' -> contAs++;
                case 'E' -> contEs++;
                case 'I' -> contIs++;
                case 'O' -> contOs++;
                case 'U' -> contUs++;
            }
        }

        System.out.println("nº de As = " + contAs);
        System.out.println("nº de Es = " + contEs);
        System.out.println("nº de Is = " + contIs);
        System.out.println("nº de Os = " + contOs);
        System.out.println("nº de Us = " + contUs);
    }
}
