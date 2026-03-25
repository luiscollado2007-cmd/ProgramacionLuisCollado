package FUNCIONES;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        for (int cont = 1; cont <= 5; cont++) {
            System.out.println("Dime el precio " + cont);
            double precio = teclado.nextDouble();
            double precioFinal = precioConIVA(precio);
            System.out.println("El precio final con IVA es: " + precioFinal);
        }




    }

    public static double precioConIVA(double num1){
        double preciosIVA = num1 * 1.21;
        return preciosIVA;
    }
}
