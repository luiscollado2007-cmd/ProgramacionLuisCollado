package repasora2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número y te doy su tabla de multiplicar");
        int numMulp = sc.nextInt();

        tablaMultiplicar(numMulp);
    }

    public static void tablaMultiplicar(int num){
        for (int cont = 0; cont <= 10; cont++) {
            System.out.println(num + " * " + cont + " = " + num * cont);
        }
    }
}
