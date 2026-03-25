package FUNCIONES;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu edad, por favor");
        int edadUsuario = teclado.nextInt();

        boolean edadUsua = esMayorEdad(edadUsuario);
        System.out.println("¿Eres mayor de edad? " + edadUsua);
    }
    public static boolean esMayorEdad(int edad1){
        return edad1 >=18;
    }
}
