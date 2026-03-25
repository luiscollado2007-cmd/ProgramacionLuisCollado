package bucles;

import java.util.Scanner;

public class EjemploDoWhile {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y cuento desde el 1 a ese");
        int numero = teclado.nextInt();
        int contador = 1;
        do {
            contador++;
            System.out.println("Número: " + contador++);
        }while (contador <= numero);

        System.out.println("Fin del porgrama");
    }
}
