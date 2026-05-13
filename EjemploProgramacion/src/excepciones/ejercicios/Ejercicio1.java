package excepciones.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Introduce un número:");
            int numero = teclado.nextInt();
            System.out.println("Valor introducido: " + numero);
        }catch (InputMismatchException e){
            System.out.println("Valor introducido incorrecto");
        }
        teclado.close();
    }
}
