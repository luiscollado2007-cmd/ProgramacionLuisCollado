package bucles;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema");
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int numero1;
        int numero2;
        double potencia;
        float resultado;
    do {
        System.out.println("Elija su opción");
        System.out.println("1 - Sumar");
        System.out.println("2 - Dividir");
        System.out.println("3 - Potencia");
        System.out.println("0 - Salir");
        opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Ok, vamos a sumar. Te voy a pedir dos números");
                //TODO
                numero1 = teclado.nextInt();
                numero2 = teclado.nextInt();
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                System.out.println("Ok, vamos a dividir. Te voy a pedir dos números");
                //TODO
                numero1 = teclado.nextInt();
                numero2 = teclado.nextInt();
                resultado = (float) numero1 / numero2;
                System.out.println("El resultado de la división es: " + resultado);
                break;
            case 3:
                System.out.println("Ok, vamos a hacer la potencia 1. Te voy a pedir dos números");
                //TODO
                numero1 = teclado.nextInt();
                numero2 = teclado.nextInt();

                potencia = Math.pow(numero1, numero2);
                System.out.println("La potencia es: " + potencia);
                break;
            case 4:
                System.out.println("Ok, vamos a hacer la potencia 2. Te voy a pedir dos números");
                //TODO
                numero1 = teclado.nextInt();
                numero2 = teclado.nextInt();
                potencia = Math.pow(numero1, numero2);
                 if (numero2 == 0) {
                    potencia = 1;
                 }else if (numero2 < 0){
                    potencia = 1 / potencia;
                 }
                System.out.println("El resultado es: " + potencia);
                 break;
            case 0:
                System.out.println("Adiós");
                break;
            default:
                System.out.println("Opción no válida. Por favor pruebe de nuevo");
        }
    }while (opcion != 0);

    }
}
