package Strings;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase y te digo si es palíndromo");
        String frase = teclado.nextLine();

        char[] caracteresFrase = frase.toCharArray();
        for (int cont = 0; cont < caracteresFrase.length; cont++) {
            System.out.println(caracteresFrase[cont]);

        }
         int contadorFrase = caracteresFrase.length -1;
        for (int cont = 0; cont < caracteresFrase.length ; cont++) {
            System.out.println(caracteresFrase[cont]);
            int frase1 = caracteresFrase[contadorFrase];
            caracteresFrase[cont] = (char) contadorFrase;
            contadorFrase--;
        }
        System.out.println(caracteresFrase);

        if (frase.equals(caracteresFrase)){
            System.out.println("Es una palabra palíndroma");
        }else{
            System.out.println("NO es una palabra palíndroma");
        }
    }
}
