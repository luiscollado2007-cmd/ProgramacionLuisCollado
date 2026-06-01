package repasora2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime otro número");
        int num2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Dame uno más y ya");
        int num3 = sc.nextInt();
        sc.nextLine();

        System.out.println("El número mayor entre " + num1 + " y " + num2 + " es: " + numeroMayor(num1,num2));
    }

    public static int numeroMayor(int a, int b){
        if (a > b){
            return a;
        }else{
            return b;
        }
    }
}
