package bucles;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número por teclado y te muestro en pantalla la tabla multiplicar de ese número con el siguiente formato");
        int numero = teclado.nextInt();
        int cont;

        for (cont = 0; cont <= 10; cont++){
            int resultado = numero * cont;
            System.out.println(numero + " x " + cont + " = " + resultado);
        }
        System.out.println("El último valor es: " + cont);
    }
}
