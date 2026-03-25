package FUNCIONES;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el precio original");
        double precioOriginal = teclado.nextDouble();
        System.out.println("Introduce el precio con descuento");
        double precioDescuento = teclado.nextDouble();

        double res = porcentaje(precioOriginal ,precioDescuento);
        if (res >= 0){
            System.out.println("El descuento es: " + res);
        }else {
            System.out.println("El valor introducido no es válido");
        }
    }

    public static double porcentaje(double precio, double pre){
        if (precio <= 0 || pre <= 0 || pre > precio){
            return -1;
        }
        double descuento = (precio - pre) / precio;
        return descuento;
    }
}
