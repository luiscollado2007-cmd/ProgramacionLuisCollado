package repasora2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = teclado.nextInt();

        System.out.println("Eres mayor de edad? " + (esMayorDeEdad(edad) ? "SI" : "NO"));

    }

    public static boolean esMayorDeEdad(int a){
        return a >= 18;
    }
}
