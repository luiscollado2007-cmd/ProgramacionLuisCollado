package repasora2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt();

        if (dimeSigno(num) == -1){
            System.out.println("El número es negativo");
        } else if (dimeSigno(num) == 1) {
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es igual a 0");
        }
    }

    public static int dimeSigno(int a){
        if (a < 0){
            return -1;
        }else if (a > 0){
            return 1;
        }else{
            return 0;
        }
    }
}
