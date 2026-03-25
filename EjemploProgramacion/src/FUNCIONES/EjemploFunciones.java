package FUNCIONES;

import java.util.Scanner;

public class EjemploFunciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime numero 1");
        int numero1 = teclado.nextInt();
        System.out.println("Dime numero 2");
        int numero2 = teclado.nextInt();

        int res = suma(numero1,numero2);
        System.out.println("El resultado es: " + res);
    }

    public static int suma(int num1, int num2){
        int resultadoSuma = num1 + num2;
        return resultadoSuma;
    }


}
