package bucles;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número para realizar su pirámide:");
        int numero = teclado.nextInt();


        if (numero > 0){
            for (int numeroRepetido = 1; numeroRepetido <= numero; numeroRepetido+=2){
                for (int contador = 0; contador < numeroRepetido; contador++){
                    numero = (numero * 2) - 1;
                    System.out.print(" ");
                    System.out.print("*");

                }
                System.out.println();
            }
        }else {
            System.out.println("El número que has introducido no es válido");
        }



    }
}

