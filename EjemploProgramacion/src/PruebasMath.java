import java.util.Scanner;

public class PruebasMath {

    public static void main(String[] args) {

        //Pedir numero1 al usuario
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el numero 1");
        int num1 = teclado.nextInt();

        //Pedir numero2 al usuario
        System.out.println("Dime el numero 2");
        int num2 = teclado.nextInt();

        //Calcular numero1 ^ numero 2
        double potencia = Math.pow(num1, num2);
        System.out.println("La potencia es: " + potencia);

        //Luego mostrar el maximo de los dos numeros:
        System.out.println("Maximo entre numeros: " + Math.max(num1, num2));
        System.out.println("Redondeo un RA con 4.5: " + Math.round(4.51));
    }
}
