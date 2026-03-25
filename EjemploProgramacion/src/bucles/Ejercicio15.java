package bucles;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número y te digo cuántos múltiplos de 3 hay desde 1 hasta ese número");
        int numero = teclado.nextInt();
        int contador = 0;

        for (int multiplo3 = 1; multiplo3 <= numero; multiplo3++){
            if (multiplo3 % 3 == 0){
                contador++;

            }


        }
        System.out.println("Cantidad de múltiplos de 3: " + contador);
    }
}
