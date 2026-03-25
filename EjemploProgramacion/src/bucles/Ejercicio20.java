package bucles;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número entero entre 0 y 20 y te muestro por pantalla desde el 1 hasta el numero que tu desees");
        int numero = teclado.nextInt();

        if (numero >= 0 && numero <= 20){
            for (int numeroRepetido = 1; numeroRepetido <= numero; numeroRepetido++){
                for (int contador = 0; contador < numeroRepetido; contador++){
                    System.out.print(numeroRepetido);
            }
                System.out.println();
            }
        }else {
            System.out.println("El número debe estar entre 0 y 20");
        }



    }
}
