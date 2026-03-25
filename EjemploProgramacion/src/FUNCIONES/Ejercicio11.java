package FUNCIONES;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número y te hago la tabla de multiplicación");
        int numeroUsuario = teclado.nextInt();


        tablaMultiplicar(numeroUsuario);
    }

    public static void tablaMultiplicar(int num){
        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int cont = 0; cont <= 10; cont++) {
            System.out.println(num + " x " + cont + " = " + (num * cont));
        }
    }
}
