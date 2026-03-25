package arrays;

import java.util.Arrays;

public class EjemploArrays {
    public static void main(String[] args) {

        double[] notas = new double[6];
        notas[0] = 6.1;
        notas[1] = 2.3;
        System.out.println("Notas: " + Arrays.toString(notas));
        double valorPrimeraNota = notas[0];
        System.out.println("valorPrimeraNota = " + valorPrimeraNota);
        System.out.println("Nota de posición 0: " + notas[0]);
        System.out.println("Nota de posición 1: " + notas[1]);

        //Crea un array de enteros con las fechas de nacimiento de tus 3 mejores amigos
        //Mete los valores, y luego accede a cada uno de ellos mostrándolos por pantalla
        //Coge la edad del primer elemento, y multiplicalo por 7.

        //Crea un array de Strings,con los nombres de tus mejores amigos
        //Mete los valores, y luego accede a cada uno de ellos mostrándolos por pantalla

        //Ejercicio: pedir al usuario cuántos amigos tiene
        //Crear un array de edades y otro de nombres, de longitud igual al nº de amigos
        //Con un bucle, ir pidiendo edad y nombre de cada amigo
    }
}
