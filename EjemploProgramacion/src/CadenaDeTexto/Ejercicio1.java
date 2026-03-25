package CadenaDeTexto;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase y te separo cada palabra");
        String frase = teclado.nextLine();
        String espacio = " ";


        for (int cont = 0; cont < frase.length(); cont++) {
            char letra = frase.charAt(cont);
            if (letra != ' '){
                espacio+=letra;
            }else{
                if (!espacio.isEmpty()){
                    System.out.println(espacio);
                    espacio = " ";
                }
            }
        }
        if (!espacio.isEmpty()){
            System.out.println(espacio);
        }
    }
}
