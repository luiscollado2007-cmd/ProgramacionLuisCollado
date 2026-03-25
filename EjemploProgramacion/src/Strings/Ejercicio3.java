package Strings;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre, por favor");
        String nombre = teclado.nextLine();
        System.out.println("Dime tu primer apellido, por favor");
        String Apellido1 = teclado.nextLine();
        System.out.println("Dime tu segundo apellido, por favor");
        String Apellido2 = teclado.nextLine();


        String conjunto = nombre.substring(0,3) + Apellido1.substring(0,3) + Apellido2.substring(0,3);

        conjunto = conjunto.toUpperCase();
        System.out.println(conjunto);

    }
}
