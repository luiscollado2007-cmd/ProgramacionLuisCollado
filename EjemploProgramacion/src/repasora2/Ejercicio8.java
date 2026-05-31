package repasora2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero entero");
        int num = teclado.nextInt();
        System.out.println("La suma es: " + suma1aN(num));
        System.out.println("El producto es: " + producto1aN(num));
        System.out.println("El valor intermedio es: " + intermedio1aN(num));
    }

    public static int suma1aN(int n){
        int suma = 0;
        for (int cont = 1; cont < n; cont++) {
            suma += cont;
        }
        return suma;
    }

    public static int producto1aN(int n){
        int producto = 1;
        for (int cont = 1; cont < n; cont++) {
            producto *= cont;
        }
        return producto;
    }

    public static double intermedio1aN(int n){
        return (1 + n) / 2;
    }
}
