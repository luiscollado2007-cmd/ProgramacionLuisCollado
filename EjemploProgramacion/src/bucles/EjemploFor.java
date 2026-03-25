package bucles;

import java.util.Scanner;

public class EjemploFor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántas veces quieres ver el nombre de Paco?");
        int numero = teclado.nextInt();

        for (int cont = 1; cont <= numero; cont++) {
            System.out.println("Paco. Llevo " + cont + " vez/veces");
        }
    }
}
