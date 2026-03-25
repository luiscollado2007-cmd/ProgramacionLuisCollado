package bucles;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un año y te digo si es bisiesto.");
        int numero = teclado.nextInt();

        boolean divisible4 = (numero % 4) == 0;
        boolean divisible400 = (numero % 400) == 0;
        boolean divisivble100 = (numero % 100) == 0;
        if ( (divisible4 && divisible400) || (divisible4 && !divisivble100)){
            System.out.println(numero + " Es bisiesto.");
        }else{
            System.out.println(numero + " NO es bisiesto");
        }
    }
}
