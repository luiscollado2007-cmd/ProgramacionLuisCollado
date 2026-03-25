package FUNCIONES;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero entero, por favor");
        int numero = teclado.nextInt();
        System.out.println("Introduce el segundo numero entero, por favor");
        int numero2 = teclado.nextInt();
        System.out.println("Introduce el tercer numero entero, por favor");
        int numero3 = teclado.nextInt();

        int resMayor = numMayor(numero, numero2);
        System.out.println("El número mayor es: " + resMayor);

    }
    public static int numMayor(int num1, int num2){
        int maxNumero = 0;
        if (num1 > num2){
            maxNumero = num1;
        }else{
            maxNumero = num2;
        }
        return maxNumero;
    }
}
