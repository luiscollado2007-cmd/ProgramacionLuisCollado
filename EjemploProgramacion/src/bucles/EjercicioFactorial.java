package bucles;

import java.util.Scanner;

public class EjercicioFactorial {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te hago el factorial");
        int numero = teclado.nextInt();
        System.out.println(numero + "!=");
        int resFactorial =1;
        for (int contador = numero; contador >= 1; contador--){
            resFactorial = resFactorial * contador;
            if (contador != 1){
                System.out.print(contador + "·");
            }else{
                System.out.print(contador);
            }
        }
        System.out.println("\n \t \"El resultado es: " + resFactorial);
    }
}
