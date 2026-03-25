package FUNCIONES;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un valor entero, por favor y te muestro la suma de 1 hasta el valor entero que introduzcas" +
                "al igual que el producto y el valor intermedio");
        int numeroEntero = teclado.nextInt();

        int resSuma = suma1aN(numeroEntero);
        System.out.println("El sumatorio es: " + resSuma);

        int resProducto = producto1aN(numeroEntero);
        System.out.println("El producto de 1 hasta al valor que has introducido es: " + resProducto);

        double resValorIntermedio = intermedio1aN(numeroEntero);
        System.out.println("El valor intermedio es: " + resValorIntermedio);

    }

    public static int suma1aN(int n){
        int suma = 0;
        for (int cont = 1; cont <= n ; cont++) {
            suma += cont;
        }
        return suma;
    }

    public static int producto1aN(int n){
        int producto = 1;
        for (int cont = 1; cont <= n  ; cont++) {
            producto *= cont;
        }
        return producto;
    }

    public static double intermedio1aN(int n){
        return (1 + n) / 2.0;
    }
}
