package FUNCIONES;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame los kilómetros que desees usar y te lo paso a millas");
        double kilometros = teclado.nextDouble();

        double res = conversionMillas(kilometros);
        System.out.println("Los kilómetros introducidos anteriormente son: " + res + " millas");
    }

    public static double conversionMillas(double num1){
        return num1 / 1.609344;
    }
}
