package FUNCIONES;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2 = teclado.nextInt();

        int minimNumero = minimo(numero1, numero2);
        System.out.println("El número mínimo es: " + minimNumero);
    }

    public static int minimo(int num1, int num2){
        int minNumero = 0;
        if (num1 < num2){
            minNumero = num1;
        }else{
            minNumero = num2;
        }
        return minNumero;
    }
}
