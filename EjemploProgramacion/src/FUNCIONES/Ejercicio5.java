package FUNCIONES;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un valor entero en millas");
        double numMillas = teclado.nextDouble();

        double resEnKilometro = millas_a_kilometros((int) numMillas);
        System.out.println("El resultado en kilometros es: " + resEnKilometro);

    }

    public static double millas_a_kilometros(int millas){
        double kilometro = 1.60934;
        double resultadoKilometro = millas * kilometro;
        return resultadoKilometro;
    }
}
