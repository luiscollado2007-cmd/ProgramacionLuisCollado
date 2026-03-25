package FUNCIONES;

import java.util.Scanner;

public class EjemploDivision {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        imprimirMenuCustom(2);

        System.out.println("Dime numero 1");
        int numero1 = teclado.nextInt();
        System.out.println("Dime numero 2");
        int numero2 = teclado.nextInt();

        float res = division(numero1, numero2);
        if (res != 0){
            System.out.println("La división es: " + res);
        }

        int resu = suma(numero1, numero2);
        System.out.println("La suma es: " + resu);


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
    public static int suma(int num1, int num2){
        int resultadoSuma = num1 + num2;
        return resultadoSuma;
    }

    /**
     * Funcion que impirme menu por pantalla
     */
    public static void imprimirMenu(){

        System.out.println("Bienvenido a la calculadora");
        System.out.println("1. Sumar");
        System.out.println("2. Dividir");
        System.out.println("3. Multiplicar");
        System.out.println("0. Salir");
    }
    public static void imprimirMenuCustom(int numOpciones){

        System.out.println("Bienvenido a la calculadora");
        if (numOpciones >=1){
        System.out.println("1. Sumar");
        }
        if (numOpciones >= 2){
        System.out.println("2. Dividir");
        }
        if (numOpciones >= 3){
        System.out.println("3. Multiplicar");
        }
        System.out.println("0. Salir");
    }
}
