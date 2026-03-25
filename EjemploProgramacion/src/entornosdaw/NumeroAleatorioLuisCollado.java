package entornosdaw;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorioLuisCollado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random generadorAleatorios = new Random();
        int numAleatorio = generadorAleatorios.nextInt(1,11);
        int numUsuario;
       do {
           System.out.println("He pensado un número del 1 al 10, intenta adivinarlo");
            numUsuario = teclado.nextInt();
           if (numUsuario != numAleatorio){
               System.out.println("Incorrecto,inténtelo de nuevo");
           }else{
               System.out.println("¡HAS ACERTADO!");
           }
       }while (numAleatorio != numUsuario);



    }
}
