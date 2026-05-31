package repasora2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un número: ");
        int num1 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Dame el otro número: ");
        int num2 = teclado.nextInt();

        System.out.println("El resultado de la multiplicación de ambos números es: " + multiplicarNumeros(num1,num2));
    }

    public static int multiplicarNumeros(int a, int b){
        return a*b;
    }
}
