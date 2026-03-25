package FUNCIONES;

import java.util.Scanner;

public class EjercicioCalculadoraFunciones {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        int opcion;
        int numero1;
        int numero2;

        do{
            imprimirMenu();
            System.out.println("Elije la operación que desea, por favor");
            opcion = teclado.nextInt();
            imprimirMenuCal(opcion);
            switch (opcion) {
                case 1:
                    System.out.println("Ok, vamos a sumar. Te voy a pedir dos numeros");
                    numero1 = teclado.nextInt();
                    numero2 = teclado.nextInt();
                    int res = suma(numero1, numero2);
                    System.out.println("Resultado suma: " + res);
                    break;
                case 2:
                    System.out.println("Ok, vamos a dividir. Te voy a pedir dos numeros");
                    numero1 = teclado.nextInt();
                    numero2 = teclado.nextInt();
                    float resDivision = division(numero1, numero2);
                    System.out.println("El resultado de la división es: " + resDivision);
                    break;
                case 3:
                    System.out.println("Ok, vamos a hacer la potencia. Te voy a pedir dos numeros");
                    numero1 = teclado.nextInt();
                    numero2 = teclado.nextInt();

                    double resPotencia = potencia(numero1, numero2);
                    System.out.println("La potencia es: " + resPotencia);

                    break;
                case 4:
                    System.out.println("Ok, vamos a hacer la potencia tipo 2. Te voy a pedir dos numeros");
                    numero1 = teclado.nextInt();
                    numero2 = teclado.nextInt();
                    double potencia = Math.pow(numero1, numero2);

                    if (numero2 == 0) {
                        potencia = 1;
                    } else if (numero2 < 0) {
                        potencia = 1 / potencia;
                    }
                    System.out.println("El resultado es: " + potencia);


                case 0:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor pruebe de nuevo");
            }
        } while(opcion !=0);
    }
    public static void imprimirMenu(){
        System.out.println("Bienvenido a la calculadora. Tienes varias opciones:");
        System.out.println("1 - Sumar");
        System.out.println("2 - Dividir");
        System.out.println("3 - Potencia");
        System.out.println("0 - Salir");
    }

    public static void imprimirMenuCal(int opcion){

        if (opcion == 1){
        System.out.println("1 - Sumar");
        }
        if (opcion == 2){
        System.out.println("2 - Dividir");
        }
        if (opcion == 3){
        System.out.println("3 - Potencia");
        }
        if (opcion == 0){
        System.out.println("0 - Salir");
        }
    }

    public static int suma(int num1, int num2){
        return num1 + num2;
    }

    public static float division(int num1, int num2){
        float resultado = 0;
        if (num2 == 0){
            System.out.println("Error, no se puede dividir entre 0");
        }else{
            resultado = (float) num1 / num2;
        }
        return resultado;
    }

    public static double potencia (int num1, int num2){
        return Math.pow(num1, num2);
    }
}
