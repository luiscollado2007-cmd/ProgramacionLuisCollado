package FUNCIONES;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el ancho del rectángulo");
        double ancho = teclado.nextInt();
        System.out.println("Dime el alto del rectángulo");
        double alto = teclado.nextInt();

        double resPerimetro = perimetroRectangulo(ancho, alto);
        System.out.println("El perímetro del rectángulo es: " + resPerimetro);

        double resArea = areaRectangulo(ancho, alto);
        System.out.println("El área del rectángulo es: " + resArea);
    }

    public static double perimetroRectangulo(double num1, double num2){
        return (num1 + num2) * 2;
    }
    public static double areaRectangulo(double num1, double num2){
        return num1 * num2;
    }
}
