package repasora2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un número en millas");
        int numMillas = scanner.nextInt();

        System.out.println(numMillas + " millas son: " + millas_a_kilometros(numMillas) + " kilómetros");
    }

    public static double millas_a_kilometros(int millas){
        return millas * 1.60934;
    }
}
