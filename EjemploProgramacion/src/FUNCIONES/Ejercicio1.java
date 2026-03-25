package FUNCIONES;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        double numero1 = teclado.nextDouble();
        System.out.println("Introduce el segundo número");
        double numero2 = teclado.nextDouble();

        double res = multiplica(numero1,numero2);
        System.out.println("El resultado de la multiplicación es: " + res);
    }

    public static double multiplica(double num1, double num2){
        double resultadoMultiplicacion = num1 * num2;
        return resultadoMultiplicacion;
    }
}
