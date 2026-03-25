package FUNCIONES;

import java.util.Scanner;

/*
Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear una
función donde le pasemos los datos y devuelva si es correcta o no.
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el día");
        int dia = teclado.nextInt();
        System.out.println("Introduce el mes");
        int mes = teclado.nextInt();
        System.out.println("Introduce el año");
        int ano = teclado.nextInt();

        if (fechaCorrecta(dia,mes,ano)){
            System.out.println("La fecha es correcta");
        }else{
            System.out.println("La fecha no es correcta");
        }
    }

    public static boolean fechaCorrecta(int num1, int num2, int num3){
        return (num1 >=1 && num1 <= 30) && (num2 >=1 && num2 <= 12) && (num3 > 0);
    }

}
