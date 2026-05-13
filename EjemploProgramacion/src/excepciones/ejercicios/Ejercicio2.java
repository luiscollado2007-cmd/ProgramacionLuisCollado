package excepciones.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Dame un número:");
            int numero1 = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Dame otro número:");
            int numero2 = teclado.nextInt();
            teclado.nextLine();

            int division = numero1 / numero2;
            System.out.println("La división entre los números introducidos es: " + division);
        }catch (InputMismatchException e){
            System.out.println("Valores introducidos correctos.");
        }catch (ArithmeticException e){
            System.out.println("La división no es válida");
        }
        teclado.close();
    }
}
