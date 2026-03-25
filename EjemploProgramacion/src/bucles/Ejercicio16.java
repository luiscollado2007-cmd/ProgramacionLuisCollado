package bucles;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número");
        int numero = teclado.nextInt();

        boolean esPrimo = true;
        int divisor = 2;
        while (divisor < numero && esPrimo){
            if (numero % divisor == 0){
                esPrimo = false;
            }
            divisor++;
        }

        if (esPrimo){
            System.out.println(numero + " es primo");
        }else {
            System.out.println(numero + " no es primo");
        }
    }
}
