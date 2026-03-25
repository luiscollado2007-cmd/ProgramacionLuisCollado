package FUNCIONES;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número entero y te muestro por pantalla si es negativo,positivo o 0");
        int numero = teclado.nextInt();

        int signoNumero = dimeSigno(numero);
        System.out.println("Su signo es: " + signoNumero);
    }

    public static int dimeSigno(int num1){
        if (num1 < 0){
            return num1 = -1;
        } else if (num1 == 0) {
            return num1 = 0;
        } else{
            return num1 = 1;
        }
    }
}
