package repasora2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el ancho");
        int ancho = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dame el alto");
        int alto = scanner.nextInt();
        scanner.nextLine();

        System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo(ancho,alto));
        System.out.println("El area del rectangulo es: " + areaRectangulo(ancho,alto));
    }

    public static double perimetroRectangulo(double ancho, double alto){
        return 2 * (ancho + alto);
    }

    public static double areaRectangulo(double ancho, double alto){
        return ancho * alto;
    }
}
