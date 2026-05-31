package repasora2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un número");
        int num1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dame otro número");
        int num2 = teclado.nextInt();

        System.out.println("El número más pequeño es: " + minimo(num1,num2));
    }

    public static int minimo(int a, int b){
        if (a < b){
            return a;
        }else{
            return b;
        }
    }
}
