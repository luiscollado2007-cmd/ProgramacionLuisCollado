package Production;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            Random generadorAleatorios = new Random();
            int numAleatorio = generadorAleatorios.nextInt(1, 11);
            System.out.println("Soy Luis Antonio Collado Santos y he creado este código con mis conocimientos");
            System.out.println("He pensado un número del 1 al 10, adivinalo");

            int numUsuario;
            do {
                numUsuario = teclado.nextInt();
                if (numUsuario != numAleatorio) {
                    System.out.println("Incorrecto,inténtelo de nuevo");
                } else {
                    System.out.println("¡HAS ACERTADO!");
                }
            } while(numAleatorio != numUsuario);

        }
    }

